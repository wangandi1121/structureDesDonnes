package Search;

import java.util.Arrays;

public class majorityElement {
	 public int majorityElement(int[] nums) {
//1.排序法
//		 Arrays.sort(nums);
//	     return nums[nums.length/2];
//2.摩尔投票法
		 int count = 0;
		 Integer candidate = null;
		 for(int num:nums) {
			 if(count == 0) {
				 candidate = num;
			 }
			 count += (num == candidate)? 1:-1;
		 }
		 return candidate;
	    }
}
