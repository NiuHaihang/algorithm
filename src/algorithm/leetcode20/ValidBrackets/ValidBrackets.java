package algorithm.leetcode20.ValidBrackets;

import java.util.Stack;

public class ValidBrackets {
	public static boolean isValid(String s) {
		if(s.length() == 0) return true;
		if(s.length() == 1) return false;
		Stack<Character> ans = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(!ans.isEmpty() && equalsTo(ans.peek(), s.charAt(i))) {
				ans.pop();
				continue;
			}
			ans.push(s.charAt(i));
		}
		if(ans.isEmpty())	return true;
		else return false;
	}
	
	private static boolean equalsTo(Character a,Character b) {
		if(a == '(' && b == ')') return true;
		else if(a == '[' && b == ']') return true;
		else if(a == '{' && b =='}') return true;
		else return false;
	}
	
	public static void main(String args[]) {
		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";
		String s4 = "([)]";
		String s5 = "{[]}";
		boolean ans1 = isValid(s1);
		boolean ans2 = isValid(s2);
		boolean ans3 = isValid(s3);
		boolean ans4 = isValid(s4);
		boolean ans5 = isValid(s5);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		System.out.println(ans5);
	}
}
