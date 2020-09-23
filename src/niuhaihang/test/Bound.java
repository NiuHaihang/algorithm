package niuhaihang.test;

public class Bound {
	public int left_boud(int[] nums,int target) {//返回大于等于目标值的最小数
		int low =0,high = nums.length-1;
		while(low <= high) {
			System.out.println("low="+low+",high="+high);
			int mid = low+((high - low)>>1);
		if(nums[mid] >= target) {
			high = mid-1;
		}else if(nums[mid] < target) {
			low = mid +1;
			}
		}
		return low;
	}
	public int right_bound(int[] nums,int target) {//返回小于等于target的最大值
		int low = 0, high = nums.length-1;
		while(low <= high) {
			System.out.println("low1="+low+",high1="+high);
			int mid = low +((high-low)>>1);
			if(nums[mid] <= target) {
				low = mid +1;
			}else if(nums[mid] > target) {
				high = mid - 1;
			}
		}
		return high;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1,3,5,5,7,7,9};
		Bound res = new Bound();
		int left = res.left_boud(nums, 5);
		int right = res.right_bound(nums, 7);
		System.out.println("left="+left+",right="+right);
	}
}
