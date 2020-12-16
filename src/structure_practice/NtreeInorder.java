package structure_practice;

import java.util.ArrayList;
import java.util.List;

public class NtreeInorder {
	 public List<Integer> preorder(Node root) {
	        List<Integer> res = new ArrayList<Integer>();
	        res.add(root.val);
	       for(int a = 0;a<root.children.size();a++){
	           preorder(root.children.get(a));
	       }
	       return res;
	    }
}
