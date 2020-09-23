package niuhaihang.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Java8Tester {
	public static Comparator<Integer> cmp = new Comparator<Integer>(){
		public int compare(Integer a ,Integer b) {
			return b - a;
		}
	};
	public static void main(String[] args) {
		String a = new String("abc");
		String b = a.replace('a', 'd');
		System.out.println(a);
		System.out.println(b);
	}
}
