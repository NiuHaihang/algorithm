package niuhaihang.test;
import java.util.*;
public class NetEasy2020091202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int res = solve(s);
		System.out.println(res);
	}
	public static int solve(String s) {
		int n = s.length();
		int[][][] dp = new int[n][n][6];
		//dp[i][j][0]表示从i到j这段字符串中a出现的次数
		int res = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'a') {
				dp[i][i][0] = 1;
			}
			else if(s.charAt(i) == 'b') {
				dp[i][i][1] = 1;
			}else if(s.charAt(i) == 'c') {
				dp[i][i][2] = 1;
			}else if(s.charAt(i) == 'x') {
				dp[i][i][3] = 1;
			}else if(s.charAt(i) == 'y') {
				dp[i][i][4] = 1;
			}else if(s.charAt(i) == 'z') {
				dp[i][i][5] = 1;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = 0; k < 6; k++) {
					dp[i][j][k] = dp[i][j-1][k];
				}
				if(!incase(s.charAt(j))) continue;
				if(s.charAt(j)=='a'){
					dp[i][j][0]++;
				}else if(s.charAt(j) == 'b') {
					dp[i][j][1]++;
				}else if(s.charAt(j) == 'c') {
					dp[i][j][2]++;
				}else if(s.charAt(j) == 'x') {
					dp[i][j][3]++;
				}else if(s.charAt(j) == 'y') {
					dp[i][j][4]++;
				}else {
					dp[i][j][5]++;
				}
				if(match(dp[i][j])) {
					res = Math.max(res, j-i+1);
				}
			}
		}
		return res;
	}
	public static boolean match(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]%2!=0) return false;
		}
		return true;
	}
	public static boolean incase(char c) {
		if(c=='a' || c=='b' || c=='c' || c=='x' || c=='y' || c=='z') return true;
		return false;
	}
}
