package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
	boolean[] vis;
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> output = new ArrayList<Integer>();
		vis = new boolean[nums.length];
		Arrays.sort(nums);
		backtrack(nums,output,res,0);
		return res;
    }
	//需要定义标记数组标记已经填过的数字
	//解决重复问底，保证填入第i个数的时候重复数字只会被填入一次
	public void backtrack(int[ ]nums,List<Integer> output,List<List<Integer>> res,int first) {
		if(first == nums.length) {
			res.add(new ArrayList<Integer>(output));
		}
		for(int i = 0;i<nums.length;i++) {
			//对原数组排序保证相同元素相邻
			//写vis[i-1]也行，但是!vis[i-1]剪枝更加彻底，相同数字可以避免回溯
			//vis[i-1]得到相同元素排列下标是倒序，!vis[i-1]得到的是正序
			if(vis[i]||(i>0&&nums[i] == nums[i-1]&&!vis[i-1])) {
				continue;//执行下一个for
			}
			output.add(nums[i]);
			vis[i] = true;
			backtrack(nums,output,res,first+1);
			vis[i] = false;
			output.remove(first);
		}
	}
}
