package algorithm.leetcode;

public class WeeklyTest168findNumbers {
	public int findNumbers(int[] nums) {
		int res=0;
		for(int i=0;i<nums.length;i++) {
			if(isEven(nums[i])) res++;
		}
		return res;
	}
	public boolean isEven(int num) {
		int bit=0;
		while(num!=0) {
			num/=10;
			bit++;
		}
		if(bit%2==0) return true;
		return false;
	}
	public static void main(String[] args) {
		WeeklyTest168findNumbers res =new WeeklyTest168findNumbers();
		int[] nums= {12,345,3,6,7896};
		int ans=res.findNumbers(nums);
		System.out.println(ans);
	}
}
