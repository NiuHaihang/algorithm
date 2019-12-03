package niuhaihang.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] ans=new int[] {4,2,5,6,9};
		Arrays.sort(ans);
		System.out.println(ans.toString());
		for(int i:ans) {
			System.out.println(i);
		}
    }
}
