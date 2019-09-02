package algorithm.leetcode17.LetterCombination;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsBackTrace {
	public static List<String> letterCombinations(String digits){
		List<String> list = new ArrayList<>();
		if(digits.length() == 0) return list;
		backtrace(list, "", digits, 0);
		return list;
	}
	public static void backtrace(List<String> l, String s, String digit, int flag) {
		String[] s1 = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		if(flag >= digit.length()) {
			l.add(s);
			return;
		}
		String chars = s1[digit.charAt(flag) - '0' -2];
		for(int i = 0; i < chars.length();i++) {
			backtrace(l, s+chars.charAt(i), digit, flag+1);
		}
	}
	
	public static void main(String args[]) {
		String digits = "234";
		List<String> l= letterCombinations(digits);
		System.out.println(l);
	}
}
