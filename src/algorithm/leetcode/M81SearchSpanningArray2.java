package algorithm.leetcode;

public class M81SearchSpanningArray2 {
	public boolean search(int[] nums,int target) {
		int low=0,high=nums.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(nums[mid]==target) return true;
			if(nums[mid]<nums[high]) {
				if(nums[mid]<=target&&target<=nums[high])
					{
					low=mid+1;
					mid=(low+high)/2;
					}
				else
					{
					high=mid-1;
					mid=(low+high)/2;
					}
			}else if(nums[low]<nums[mid]){
				if(nums[low]<=target&&target<=nums[mid])
					{
					high=mid-1;
					mid=(low+high)/2;
					}
				else
					{
					low=mid+1;
					mid=(low+high)/2;
					}
			}else {
				if(nums[mid]==nums[low])
					{
					low++;
					mid=(low+high)/2;
					}
				else
					{
					high--;
					mid=(low+high)/2;
					}
			}
			
		}
		return false;
		
		/*int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return true;
            if(nums[start]<nums[mid]){
                if(nums[mid]>=target&&target>=nums[start]){
                   end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[end]>nums[mid]){
                if(nums[mid]<=target&&target<=nums[end]){
                   start=mid+1;
                }else{
                   end=mid-1;
                }
            }else{
                if(nums[mid]==nums[start])
                    start++;
                else
                    end--;
            }
        }
        return false;*/
	}
	public static void main(String[] args) {
		int[] nums= {3,3,1,1};
		M81SearchSpanningArray2 ans=new M81SearchSpanningArray2();
		boolean flag=ans.search(nums, 1);
		if(flag)
			System.out.println("hahhha");
		else
			System.out.println("false");
	}
	
}
