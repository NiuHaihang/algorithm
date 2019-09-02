package algorithm.GCD;

public class GCD {
	public static int Gcd(int a, int b) {
		if(a > b)
			return((a%b) == 0 ? b : Gcd(b, a%b));
		else
			return((b%a) == 0 ? a : Gcd(a, b%a));
	}
	public static int GetGCD(int a, int b) {
		if(a == b) return a;
		else if(a > b) {
			return GetGCD(a-b, b);
		}
		else {
			return GetGCD(a, b-a);
		}
	}
	public static void main(String args[]) {
		int ans = Gcd(15, 10);
		int ans1 = GetGCD(10, 15);
		System.out.println(ans+","+ans1);
	}
}
