package niuhaihang.test;

import java.util.*;
public class YFD20203{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int res = solve(nums,s);
        System.out.println(res);
    }
    public static int solve(int[] nums,int s){
        int res = 0;
        //计算从j到i的和
        int left = 0,right = 0;
        int sum = 0;
        while(right<nums.length) {
        	sum += nums[right];
        	right++;
        	if(sum <= s) {
        		res = Math.max(res, right-left);
        	}else {
        		while(sum>s) {
        			sum -= nums[left++];
        		}
        	}
        }
        return res;
    }
}