package structure_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
		 Arrays.sort(nums);
		 List<List<Integer>> res = new ArrayList();
		 if(nums == null || nums.length < 3) return res;
		 for(int k = 0;k<nums.length-2;k++) {
		
			 if(nums[k]>0)break;
			 if(k>0&&nums[k]==nums[k-1])continue;//去重(当初写了nums[k+1]出了错，如果写成k+1就会跳过本次循环，应与上次做对比跳过当前循环)
			 int i = k+1; int j = nums.length-1;
			 while(i<j) {
				 int sum = nums[i]+nums[j]+nums[k];
				 if(sum == 0) {
					 res.add(Arrays.asList(nums[k],nums[i],nums[j]));
					 while(i<j&&nums[i]==nums[i+1])i++;//去重
					 while(i<j&&nums[j]==nums[j-1])j--;
					 i++;
					 j--;
				 }
				 else if(sum<0) i++;
				 else if(sum>0) j--;
			 }
		 }
		 return res;
	    }

}
