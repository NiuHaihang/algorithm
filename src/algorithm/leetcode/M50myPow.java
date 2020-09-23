package algorithm.leetcode;

public class M50myPow {
	public double myPow(double x, int n) {
		long N=n;
		double ans = 1.00000;
		if(N==0) return ans;
		if(N<0){
			x = 1/x;
			N=-N;
		}
		return fastPow(x,N);
	}
	public double fastPow(double x,long n) {
		if(n==0) return 1.0;
		double ans = 1.0;
		double current_product = x;
		for(long i=n;i>0;i/=2) {
			if(i%2==1) {
				ans*=current_product;
			}
			current_product = current_product*current_product;
		}
		return ans;
	}
	public static void main(String[] args) {
		M50myPow ans = new M50myPow();
		double n = ans.myPow(2.00000,-2147483648);
		System.out.println(n);
	}
}
