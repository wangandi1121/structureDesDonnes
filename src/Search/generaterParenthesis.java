package Search;

import java.util.ArrayList;
import java.util.List;

public class generaterParenthesis {
	private List<String> res;
	public List<String> generaterParenthesis(int n){
		res = new ArrayList<String>();
		_generate(0,0,n,"");
		return res;
	}
	private void _generate(int left,int right,int n,String s) {
		if(left == n && right == n) {
			res.add(s);
			return;
		}
		if(left<n) {
			_generate(left+1,right,n,s+"(");
		}
		if(right<left) {
			_generate(left,right+1,n,s+")");
		}
	}
}
