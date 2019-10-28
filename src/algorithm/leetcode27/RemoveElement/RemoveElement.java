package algorithm.leetcode27.RemoveElement;

public class RemoveElement {
	public int removeElement(int[] nums,int val) {
		if(nums.length==0) return 0;
		int i,j;
		for(i=0,j=0;i<nums.length&&j<nums.length;) {
			if(nums[j]==val) {
				j++;
			}
			else {
				nums[i]=nums[j];
				i++;
				j++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int val =3;
		RemoveElement remove = new RemoveElement();
		int ans = remove.removeElement(nums, val);
		System.out.println(ans);
	}
}
