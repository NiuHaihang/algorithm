package niuhaihang.test;

public class SwapTest {
	/*public static void swap(int a,int b) {
		System.out.println("\t开始交换");
		System.out.println("\t\t交换前a="+a+",b="+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\t\t交换后a="+a+",b="+b);
	}*/
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		System.out.println("交换前a="+a+",b="+b);
		int[] c = {a,b};
		swap(c);
		System.out.println("交换后a="+a+",b="+b);
	}
	public static void swap(int[] a) {
		int temp = a[0];
		a[1]=a[0];
		a[0]=temp;
	}
}
