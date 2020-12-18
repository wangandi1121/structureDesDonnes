package DP;

public class maxSquare {
	public int maximalSquare(char[][] matrix) {
//dp(i,j)表示以i，j为正方形右下角的正方形边长最大值，最后把它平方即为所求
//dp:  if(a[i][j] = 0) dp(i,j) = 0;
//     if(a[i][j] = 1) dp(i,j)= min(dp(i-1,j),dp(i-1,j-1),dp(i,j-1))+1
		int MaxSide = 0;
		if(matrix == null||matrix.length == 0||matrix[0].length == 0)return MaxSide;
		int m = matrix.length;int n = matrix[0].length; 
		int[][] dp = new int[m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(matrix[i][j] == '1') {
                    if(i==0||j==0){
                        dp[i][j] = 1;
                    }
				else {
					dp[i][j] = Math.min((Math.min(dp[i - 1][j], dp[i][j - 1])),dp[i - 1][j - 1]) + 1;
				}
                    MaxSide = Math.max(MaxSide,dp[i][j]);
			}
		}
        }
		return MaxSide * MaxSide;
    }
}
