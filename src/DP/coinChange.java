package DP;

import java.util.Arrays;

public class coinChange {
	public int coinChange(int[] coins, int amount) {
//1.暴力：递归，指数级
//2.考虑对状态树的广度优先遍历
//3.DP：
//  dp array: f(n) = min(f(n-k),k in coins[])+1
//类似斐波那契数列，每一步换一个面额的硬币，找面值最小者，f(n)表示凑到面值为n时，钱币数目的最小者。
//加1就是再加一张面值为k的钱币
		int[] dp = new int[amount+1];
		Arrays.fill(dp,amount+1);
		dp[0] = 0;
		for(int i = 1;i<=amount;i++) {
			for(int j = 0;j<coins.length;j++) {
				if(coins[j]<=i) {
				dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
				}
			}
		}
	return dp[amount] > amount? -1:dp[amount];
    }
}
