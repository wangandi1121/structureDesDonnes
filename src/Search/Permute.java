package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute {
	//比bfs节约空间
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		List<Integer> output = new ArrayList<Integer>();
		for(int num:nums) {
			output.add(num);
		}
		int n = nums.length;
		backtrack(n,output,res,0);
		return res;
		
    }
	public void backtrack(int n,List<Integer> output,List<List<Integer>> res,int first) {
		if(first == n) {
			//dfs以后，output回到根节点变成一个空列表
			//需要添加对output的拷贝，避免结果集中出现大量空列表
			res.add(new ArrayList<Integer>(output));

		}
		for(int i = first;i<n;i++) {
			//动态维护数组，可以不用标记数组，但是这样的全排列不是按照字典序储存的
			//[0,first-1]是已填过的数的集合,[first,n-1]是待填数的集合
			//待填数的下标为i 填完后将第i个数和第first个数交换，回溯的时候交换回来可以完成撤销操作
			Collections.swap(output,first, i);
			//递归填入下一个数
			backtrack(n,output,res,first+1);
			//撤销操作
			Collections.swap(output,first,i);
		}
	}
	
}
