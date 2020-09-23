package algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class E202happyNum {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet();
		while(n != 1) {
			set.add(n);
			int temp = 0;
			while(n != 0) {
				temp += (n%10)*(n%10);
				n = n/10;
			}
			if(set.contains(temp)) return false;
			n = temp;
		}
		return true;
	}
	
	public static void main(String[] args) {
		E202happyNum ans = new E202happyNum();
		ans.isHappy(19);
	}
}
