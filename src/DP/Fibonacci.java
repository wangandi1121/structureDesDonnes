package DP;

public class Fibonacci {
//dp与递归和分治没有本质上的区别，主要看有无最优子结构，中途淘汰次优解。
	public int fib(int n) {
// 1.垃圾写法 ，状态树指数级别
		if(n<=1)return n;
		return fib(n-1)+fib(n-2);
// 2.记忆化搜索，添加缓存	
	}
	public int fib1(int n) {
		return fib1_(n,new int[n+1]);
	}
	public int fib1_(int n,int[] memo) {
		if(n<=1)return n;
		if(memo[n]==0) {
			memo[n] = fib1_(n-1,memo)+fib1_(n-2,memo);
		}
		return memo[n];
	}
//3. dp:dp方程——dp[i+1]=dp[i]+dp[i-1].
	public int fib2(int n) {
		int a = 0,b = 1,c = 0;
		for(int i = 0;i<n;i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return a;
	}
	public static void main(String[] args) {
		Fibonacci a = new Fibonacci();
		System.out.println(a.fib(10));
		System.out.println(a.fib1(10));
		System.out.println(a.fib2(10));
	}
}
