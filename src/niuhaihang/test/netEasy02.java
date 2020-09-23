package niuhaihang.test;

import java.util.*;
public class netEasy02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int B = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int res = solve(nums,B);
		System.out.println(res);
	}
	public static int solve(int[] nums,int B) {
		Arrays.sort(nums);
		for(int i = nums.length-1; i >= 0; i--) {
			if(B%nums[i] == 0) {
				//System.out.println("nums[i]="+nums[i]+",B="+B);
				B = B/nums[i];
				nums[i] = 1;
				
			}
		}

		int res = 0;
		return res;
	}
}
