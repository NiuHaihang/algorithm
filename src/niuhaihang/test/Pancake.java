package niuhaihang.test;
import java.util.*;
import java.io.*;
public class Pancake {
	public static int[][] data = new int[100005][11];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) return;
			data = new int[100005][11];
			int maxt = 0;
			for(int i = 0; i < n; i++) {
				int index = sc.nextInt();
				int time = sc.nextInt();
				if(time>maxt) maxt=time;
				data[time][index]++;
			}
			int res = 1;
			int[][] dp = new int[2][11];
			dp[0][5] = 1;
			int now = 1;
			for(int i = 1; i <= maxt; i++) {
				for(int j = 0; j<= 10; j++) {
					dp[now][j] = 0;
					int val = 0;
					if(dp[now^1][j]>0 || j>0&&dp[now^1][j-1]>0 || j<10&&dp[now^1][j+1]>0) {
						val = data[i][j];
					}
					int add = 0;
					if(dp[now^1][j]>add) add = dp[now^1][j];
					if(j>0&&dp[now^1][j-1]>add) add=dp[now^1][j-1];
					if(j<10&&dp[now^1][j+1]>add) add=dp[now^1][j+1];
					dp[now][j]=val+add;
					if(dp[now][j]>res) res = dp[now][j];
				}
				now^=1;
			}
			System.out.println(res-1);
		}
	}
	public static void print(int[][] nums) {
		for(int i =0; i < nums.length; i++) {
			System.out.println("i="+i+" ,"+ Arrays.toString(nums[i]));
		}
	}
}
