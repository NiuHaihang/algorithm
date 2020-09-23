package niuhaihang.test;
import java.util.*;
public class YFD2020091201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] res = solve(nums,m);
		for(int i = 0; i < res.length; i++) {
			if(i == res.length-1) {
				System.out.println(res[i]);
			}else {
				System.out.print(res[i]+" ");
			}
		}
	}
	public static int[] solve(int[] nums,int m) {
		for(int i = 1; i <= m; i++) {
			change(nums);
		}
		return nums;
	}
	public static void change(int[] nums) {
		int n = nums.length;
		int[] tmp = new int[n];
		int mid = n/2;
		int low = 0;
		int index = 0;
		while(low<n/2 && mid<n) {
			tmp[index++] = nums[mid++];
			tmp[index++] = nums[low++];
		}
		if(mid<n) tmp[index] = nums[mid];
		for(int i = 0; i < n; i++) {
			nums[i] = tmp[i];
		}
	}
}
