package niuhaihang.test;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		b[0] = 5;
		System.out.println(Arrays.toString(a));
	}
}
