package algorithm.leetcode;

public class WeeklyTest183numSteps {
	public int numSteps(String s) {
		int step = 0;
		int carry = 0;
		int index = s.length()-1;
		int cur = 0;
		while(index>=0) {
			cur = Integer.parseInt(String.valueOf(s.charAt(index)))+carry;
			if(cur== 2) {
				carry = 1;
				step++;
			}else {
				carry = 0;
				step++;
				index--;
			}
		}
		return step;
	}
}
