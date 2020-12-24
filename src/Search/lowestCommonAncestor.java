package Search;

public class lowestCommonAncestor {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null||p == root||q == root) {
    	   return root;
       }else {
    	   TreeNode left = lowestCommonAncestor(root.left,p,q);
    	   TreeNode right = lowestCommonAncestor(root.right,p,q);
    	   return left == null? right :(right == null?left:root);
       }
    }
  
}
