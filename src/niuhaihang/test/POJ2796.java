package niuhaihang.test;

import java.util.*;
public class POJ2796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] res = solve(nums);
		System.out.println(res[0]+" "+res[1]);
		System.out.println(res[2]);
	}
	public static int[] solve(int[] nums) {
		int[] presum = new int[nums.length+1];
		presum[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			presum[i] = nums[i]+presum[i-1];
		}
		//presum[nums.length] = presum[nums.length-1]-1;
		int[] tmp = new int[nums.length+1];
		for(int i = 0; i <= nums.length; i++) {
			if(i == nums.length) {
				tmp[i] = -1;
			}else {
				tmp[i] = nums[i];
			}
		}
		System.out.println("presum="+Arrays.toString(presum));
		Stack<Integer> s = new Stack<>();
		int res = 0,top = 0,left = 0,right = 0;
		for(int i = 0; i <= nums.length; i++) {
			if(s.isEmpty() || tmp[i]>=tmp[s.peek()]) {
				s.push(i);
			}else {
				while(!s.isEmpty() && tmp[i] < tmp[s.peek()]) {
					top = s.pop();
					//System.out.println("i="+i);
					int cur = tmp[top]*(presum[i-1]-(top==0?0: presum[top-1]));
					if(cur>res) {
						left = top+1;
						right = i;
						res = cur;
					}
				}
				tmp[top] = tmp[i];
				s.push(top);
			}
		}
		return new int[] {left,right,res};
	}
}
