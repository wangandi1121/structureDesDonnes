package DP;

public class maxSubArray {
	public int maxSub(int[] nums) {
	//dp:max_sum[i] = max(max_sum[i-1],0)+a[i]
		if(nums.length==0)return 0;
		int res = nums[0];
		for(int i = 1;i<nums.length;i++) {
			nums[i] = Math.max(nums[i-1]+nums[i], nums[i]);
			res = Math.max(res, nums[i]);
		}
		return res;
	}
}
