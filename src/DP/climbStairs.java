package DP;

public class climbStairs {
	public int climb(int n) {
		if(n<=2)return n;
		int[] dp = new int[n];
		dp[0] = 1;dp[1] = 2;
		for(int i = 2;i<n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n-1];
	}
	public static void main(String[] args) {
		climbStairs a = new climbStairs();
		System.out.println(a.climb(3));
	}
}
