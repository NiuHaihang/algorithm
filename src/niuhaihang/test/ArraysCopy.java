package niuhaihang.test;

import java.util.Arrays;

public class ArraysCopy {
	public static void main(String[] args) {
		String[] s1 = {"sdd","abc","dfg","sda"};
		String[] s2 = Arrays.copyOf(s1, 10);
		s2[1] = "djsakld";
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
	}
}
