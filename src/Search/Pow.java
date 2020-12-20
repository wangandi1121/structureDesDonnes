package Search;

public class Pow {
// x是-100～100，n是32位有效整数
//分治：1.teminator; 2.process(split the big problem);
//		3.drill down(subproblem) merge ;4.reverse statement.
		public double fastPow(double x, long n) {
	        if(n == 0)return 1.0;
	        double half = fastPow(x , n/2);
	        return n % 2 == 0? half*half : half*half*x;
	    }
	    public double myPow(double x,int n){
	        long N = n;
	        if(N<0){
	            x = 1/x ; N = -N;
	        }
	        return fastPow(x,N);
	    }

}
