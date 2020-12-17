package DP;

public class houseRobber {
	public int rob(int[] nums) {
//dp: a[i][0,1] 0表示不偷，1表示偷了
//    a[i][0] = max(a[i-1][0],a[i-1][1])
//    a[i][1] = a[i-1][0]+nums[i]
		if(nums == null||nums.length == 0)return 0;
		int n = nums.length;
		int[][] a = new int[n][2];
//初始条件
		a[0][0] = 0;
		a[0][1] = nums[0];
		
		for(int i = 1;i < n;i++) {
			a[i][0] = Math.max(a[i-1][0],a[i-1][1]);
			a[i][1] = a[i-1][0]+nums[i];
		}
		return Math.max(a[n-1][0],a[n-1][1]);
    }
}
