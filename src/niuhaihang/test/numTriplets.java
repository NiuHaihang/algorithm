package niuhaihang.test;

import java.util.Arrays;

public class numTriplets {
	public static int numTriplets(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int res = 0;
		boolean larger = false;
		for(int i = 0; i < nums1.length; i++) {
			larger = false;
			for(int j = 0; j < nums2.length; j++) {
				if(nums2[j]>nums1[i]) {
					break;
				}
				for(int k = j+1; k < nums2.length; k++) {
					
					if(nums1[i]*nums1[i]==nums2[j]*nums2[k]) res++;
				}

			}
		}
		System.out.println(res);
		for(int i = 0; i < nums2.length; i++) {
			larger = false;
			for(int j = 0; j < nums1.length; j++) {
				//System.out.println("i="+i+",="+j+",nums1[j]="+nums1[j]+",nums2[i]="+nums2[i]);
				if(nums1[j]>nums2[i]) {

					break;
				}
				for(int k = j+1; k < nums1.length; k++) {
					//System.out.println("i="+i+",j="+j+",k="+k);
					if(nums2[i]*nums2[i]==nums1[j]*nums1[k]) {
						System.out.println("ahha");
						res++;
					}
				}
			}
		}
		return res;
    }
	public static void main(String[] args) {
		int[] nums1 = {7,7,8,3};
		int[] nums2 = {1,2,9,7};
		int res = numTriplets(nums1,nums2);
		System.out.println(res);
	}
}
