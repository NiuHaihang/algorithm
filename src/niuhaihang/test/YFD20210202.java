package niuhaihang.test;
import java.util.*;
public class YFD20210202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> res = solve(nums);
		for(int i = 0; i < res.size(); i++) {
			if(i == res.size()-1) {
				System.out.println(res.get(i));
			}else {
				System.out.print(res.get(i)+" ");
			}
		}
	}
	public static List<Integer> solve(int[] nums){
		int n = nums.length;
		int h = 1;
		List<Integer> res = new ArrayList<>();
		while(Math.pow(2, h)-1<n) {
			h++;
		}
//		if(Math.pow(2, h)-1 > n) {
//			h--;
//		}
		//System.out.println("h="+h);
		for(int i = 0; i < h; i++) {
			res.add(nums[(int)Math.pow(2, i)-1]);
		}
		for(int i = (int)Math.pow(2, h-1); i < n; i++) {
			res.add(nums[i]);
		}
		if(Math.pow(2, h)-1 == n) {
			for(int i = h-1;i >0;i--) {
				res.add(nums[(int)Math.pow(2, i)-2]);
			}
			//System.out.println("满二叉树");
			return res;
		}
		int len = n-(int)Math.pow(2, h-2);
		for(int i =(n%2==0?(n+1)/2:n/2); i <= Math.pow(2, h-1)-2;i++) {
			res.add(nums[i]);
		}
		for(int i = h-2; i > 1; i--) {
			res.add(nums[(int)Math.pow(2, i)-2]);
		}
		//System.out.println(res);
		return res;
	}
}
