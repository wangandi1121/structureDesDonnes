package Search;

import java.util.ArrayList;
import java.util.List;

public class subSets {
	public List<List<Integer>> subsets (int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
		if(nums == null) {
			return ans;
		}
		dfs(ans,nums,new ArrayList<Integer>(),0);
		return ans;
	}
	private void dfs(List<List<Integer>> ans,int[] nums,List<Integer> list,int index) {
		//teminator
		if(index == nums.length) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		dfs(ans,nums,list,index+1);
		
		list.add(nums[index]);
		dfs(ans,nums,list,index+1);
		
		//reverse
		list.remove(list.size()-1);
	}
}
