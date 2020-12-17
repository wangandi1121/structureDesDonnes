package DP;

import java.util.Arrays;

public class houseRobber2 {
//写两个dp，一个是不抢第一家，一个是不抢最后一家，其他部分与打家劫舍1一样 
//简化前一题的dp
	public int rob2(int[] nums) {
		if(nums == null||nums.length == 0)return 0;
		int n = nums.length;
		if(n<=2)return Arrays.stream(nums).max().getAsInt();
		//返回nums中的最大值
		int[] dp1 = new int[n];
		dp1[0] = 0;
		dp1[1] = nums[1];
		for(int i = 2;i<n;i++) {
			dp1[i] = Math.max(dp1[i-1],dp1[i-2]+nums[i]);
		}
		int[] dp2 = new int[n];
		dp2[0] = nums[0];
		dp2[1] = Math.max(nums[0],nums[1]);
		for(int i = 2;i<n-1;i++) {
			dp2[i] = Math.max(dp2[i-1],dp2[i-2]+nums[i]);
		}
		return Math.max(dp1[n-1], dp2[n-2]);
	}
	public static void main(String[] args) {
		houseRobber2 a = new houseRobber2();
		int[] n = {1,2,3,4};
		System.out.println(a.rob2(n));
	}
}
