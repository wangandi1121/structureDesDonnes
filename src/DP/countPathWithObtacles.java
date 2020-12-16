package DP;

public class countPathWithObtacles {
	public int cPWObtacles(int[][]obtacleGrid) {
//dp逻辑：(自底向上)
//		if(a[i]) = 空地；
//       dp[i][j] = dp[i-1][j] + dp[i][i-1];
//		else dp[i][j] = 0;
	int m = obtacleGrid.length;
	int n = obtacleGrid[0].length;
	if(obtacleGrid == null||obtacleGrid.length == 0) {
		return 0;
	}
	int[][]dp = new int[m][n];
//初始化边界
	for(int i = 0;i<m;i++) {
		if(obtacleGrid[i][0]==1) {break;}
		dp[i][0] = 1;
	}
	for(int j = 0;j<n;j++) {
		if(obtacleGrid[0][j]==1) {break;}
		dp[0][j] = 1;
	}
	for(int i = 1;i<m;i++) {
		for(int j = 1;j<n;j++) {
			if(obtacleGrid[i][j]==0) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
			else {
				dp[i][j] = 0;
			}
		}
		//从右下向左上遍历，返回第一个节点。
	}
	return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		countPathWithObtacles a = new countPathWithObtacles();
		int[][] b = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(a.cPWObtacles(b));
	}
}
