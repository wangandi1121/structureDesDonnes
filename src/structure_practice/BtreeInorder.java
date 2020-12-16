package structure_practice;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BtreeInorder {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while(root != null||!stack.isEmpty()) {
        	while(root!=null) {
        		stack.push(root);
        		root = root.left;
        	}
        	root = stack.pop();
        	res.add(root.val);
        	root = root.right;
        	
        }
        return res;
	}
	
}
