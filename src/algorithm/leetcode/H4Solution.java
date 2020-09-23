package algorithm.leetcode;

public class H4Solution {
	public double findMedianSortedArrays(int[] nums1,int[] nums2) {
		double ans=0.0;
		if(nums1.length==0) {
			if(nums2.length%2==0) {
				ans=(nums2[nums2.length/2]+nums2[nums2.length/2-1])/2;
			}else {
				ans=nums2[nums2.length/2];
			}
			return ans;
		}
		if(nums2.length==0) {
			if(nums1.length%2==0) {
				ans=(nums1[nums1.length/2]+nums1[nums1.length/2-1])/2;
			}else {
				ans=nums1[nums1.length/2];
			}
			return ans;
		}
		
		return ans;
	}
}
