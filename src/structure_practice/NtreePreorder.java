package structure_practice;

import java.util.ArrayList;
import java.util.List;

public class NtreePreorder {
	    List<Integer> res = new ArrayList<Integer>();
	    public List<Integer> preorder(Node root) {
	        
	        if(root == null){
	            return res;
	        }
	        res.add(root.val);
	      for(Node child:root.children){
	          preorder(child);
	      }
	    
	       return res;
	    }
}
