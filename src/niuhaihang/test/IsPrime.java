package niuhaihang.test;


public class IsPrime {
	public boolean isPrime(int n) {
		if(n<=3) return n>1;
		if(n%6!=1&&n%6!=5) return false;
		int sqrt = (int) Math.sqrt(n);
		for(int i = 5; i <sqrt; i+=6) {
			if(n%i==0 || n%(i+2)==0) return true;
		}
		return false;
	}
}
