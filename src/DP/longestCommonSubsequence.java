package DP;

public class longestCommonSubsequence {
	public int LCS(String s1,String s2) {
		if(s1==null||s2==null)return 0;
		int m = s1.length()+1;
		int n = s2.length()+1;
		int[][]dp = new int[m][n];
		for(int i = 0;i<m;i++) {
			dp[i][0] = 0;
		}
		for(int j = 0;j<n;j++) {
			dp[0][j] = 0;
		}
		for(int i = 1;i<m;i++) {
			for(int j = 1;j<n;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		longestCommonSubsequence a = new longestCommonSubsequence();
		System.out.println(a.LCS("abcde","ace"));
	}
}
