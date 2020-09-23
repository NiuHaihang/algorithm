package niuhaihang.test;

public class BitOperation {
	public void function(int a,int b) {
		/*
		 * System.out.println(a&b); System.out.println((a^b)>>1);
		 * System.out.println((a&b)+((a^b)>>1));
		 */
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+",b="+b);
	}
	
	public static void main(String[] args) {
		BitOperation res=new BitOperation();
		res.function(10, 15);
	}
}
