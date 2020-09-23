package niuhaihang.test;
import java.util.*;
public class SnakeFibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {System.out.println(1); return;}
		long[] fib = new long[n*n];
		process(fib);
		long[][] res = helper(fib,n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				if(i == n-1 && j == n-1) {
					System.out.println(res[i][j]);
				}else {
					System.out.print(res[i][j]+" ");
				}
			}
		}
	}
	public static void process(long[] nums) {
		nums[0] = 1;
		nums[1] = 1;
		for(int i = 2; i < nums.length; i++) {
			nums[i] = nums[i-2]+nums[i-1];
		}
	}
	public static long[][] helper(long[] nums,int n){
		long[][] res = new long[n][n];
		int up = 0;
		int down = n-1;
		int left = 0;
		int right = n-1;
		int start = n*n-1;
		while(true) {
			//向右
			for(int i = left; i <= right; i++) {
				res[up][i] = nums[start];
				start--;
			}
			
			if(++up>down) break;
			//向下
			for(int i = up; i <= down; i++) {
				res[i][right] = nums[start];
				start--;
			}
			if(--right<left) break;
			//向左
			for(int i=right; i>=left;i--) {
				res[down][i] = nums[start--];
			}
			if(--down<up) break;
			//向上
			for(int i = down; i>=up; i--) {
				res[i][left] = nums[start--];
			}
			if(++left>right) break;
		}
		return res;
		
	}
}
