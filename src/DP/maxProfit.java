package DP;

public class maxProfit {
	 public int maxProfit(int[] prices) {
//贪心
		 int res = 0;
		 for(int i = 1;i<prices.length;i++) {
			 res += Math.max(0,prices[i]-prices[i-1]);
		 }
		 return res;
	    }
}
