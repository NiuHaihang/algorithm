package algorithm.leetcode;

public class M31NextPermutation {
	public void nextPermutation(int[] nums) {
		if(nums.length<=1) return;
		int cur=nums.length-1;
		while(cur>=1&&nums[cur]<=nums[cur-1]) {
			cur--;
		}
		cur--;
		if(cur==-1) {
			reverse(nums,0);
			return;
		}
		int tail=nums.length-1;
		while(nums[tail]<=nums[cur]) {
			tail--;
		}
		int temp=nums[cur];
		nums[cur]=nums[tail];
		nums[tail]=temp;
		reverse(nums,cur+1);
	}
	public void reverse(int[] nums,int start) {
		int tail=nums.length-1;
		for(int i=start;i<=(start+nums.length-1)/2;i++) {
			int temp = nums[i];
			nums[i]=nums[tail];
			nums[tail]=temp;
			tail--;
		}
	}
		
	public static void main(String[] args) {
		int[] nums= {1,1,5};
		M31NextPermutation p=new M31NextPermutation();
		p.nextPermutation(nums);
		for(int i:nums){
			System.out.println(i);
		}
	}
}
