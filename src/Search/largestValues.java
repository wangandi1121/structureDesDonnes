package Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class largestValues {
	public List<Integer> largestValues(TreeNode root) {
		//找一颗树每层的最大值，采用广度优先遍历
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> values = new ArrayList<>();
        if(root != null)
        	queue.add(root);
        while(!queue.isEmpty()) {
        	int max = Integer.MIN_VALUE;
        	int levelSize = queue.size();
        	for(int i = 0;i<levelSize;i++) {
        		TreeNode node = queue.poll();
        		max = Math.max(max, node.val);
        		if(node.left!=null)
        			queue.add(node.left);
        		if(node.right!=null)
        			queue.add(node.right);
        	}
        	values.add(max);
        }
        return values;
    }
	
}
 
