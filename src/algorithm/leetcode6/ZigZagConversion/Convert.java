package algorithm.leetcode6.ZigZagConversion;

public class Convert {
	public static String convert(String s, int numRows) {
		int l = s.length();
		//System.out.println(l);
		int col = l;
		int col1 = 0;
		int n = 0;
		char ans[][] = new char[numRows][col];
		
		if(numRows == 1) return s;
		else {
		
			for(int j = 0; j < col; j++) {
				for(int i = 0; i < numRows; i++) {
					if(n >= s.length()) {
						col1 = j;
						break;
					}
					if((j % (numRows-1) == 0)) {
						ans[i][j] = s.charAt(n);
						n++;
					}
					else {
						int temp = j % (numRows - 1);
						ans[numRows-temp-1][j] = s.charAt(n);
						n++;

						break;
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < numRows; i++) {
				for(int j = 0; j <= col1; j++) {
					if(!(ans[i][j] == 0)) {
						sb.append(ans[i][j]);
					}
				}
			}
			String solution = sb.toString();
			return solution;
		}
	}
	
	public static void main(String args[]) {
		//String s = "PAYPALISHIRING";
		String s = "A";
		String ans = convert(s, 2);
		System.out.println(ans);
	}
}
