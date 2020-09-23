package niuhaihang.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrayint2Integer {
	public static void main(String[] args) {
		int[] a = {1,2,3,3};
		int[] b = new int[] {1,2,3};
		Integer[] ia = IntStream.of(a).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
		System.out.println(Arrays.toString(ia));
		List<Integer> ib = IntStream.of(b).boxed().collect(Collectors.toList());
		System.out.println(ib);
	}
}	
