package Search;

import java.util.HashMap;
import java.util.Map;

public class buildTree {
	private Map<Integer,Integer> indexMap;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		//从前序与中序遍历构造二叉树
		int n = preorder.length;
		indexMap = new HashMap<Integer,Integer>();
		for(int i = 0;i<n;i++) {
			indexMap.put(inorder[i],i);
		}
		return mybuildTree(preorder,inorder,0,n-1,0,n-1);
    }
	public TreeNode mybuildTree(int[] preorder, int[] inorder,
			int pre_left,int pre_right,int in_left,int in_right) {
		if(pre_left>pre_right) {
			return null;
		}
		int pre_root = pre_left;
		//前序遍历的第一个节点就是根节点
		int in_root = indexMap.get(preorder[pre_root]);
		//在中序遍历中定位根节点
		TreeNode root = new TreeNode(preorder[pre_root]);
		int size_left_subtree = in_root - in_left;
		root.left = mybuildTree(preorder,inorder,pre_left+1,pre_left+size_left_subtree,in_left,in_root-1);
		root.right = mybuildTree(preorder,inorder,pre_left+size_left_subtree+1,pre_right,in_root+1,in_right);
		return root;
		
	}
}
 class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
}
