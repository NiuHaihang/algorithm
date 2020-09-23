package algorithm.leetcode;

public class E53maxSubArray {
	 public int maxSubArray(int[] nums) {
	        return maxSubArray(nums,0,nums.length-1);
	    }
    public int maxSubArray(int[] nums,int low,int high){
    	System.out.println("hahahah");
        if(low==high) return nums[low];
        int mid = (low+high)/2;
        int left=mid;
        int leftSum=nums[left];
        int leftTempSum=0;
        while(left>=low){
            leftTempSum+=nums[left];
            leftSum=Math.max(leftSum,leftTempSum);
            left--;
        }
        int right=mid+1;
        int rightSum=nums[right];
        int rightTempSum=0;
        while(right<=high){
            rightTempSum+=nums[right];
            rightSum=Math.max(rightSum,rightTempSum);
            right++;
        }
        return Math.max(leftSum+rightSum,Math.max(maxSubArray(nums,low,mid),maxSubArray(nums,mid+1,high)));
    }
    public static void main(String[] args) {
    	E53maxSubArray o = new E53maxSubArray();
    	int[] nums= {84,87,78,16,94,36,87,93,50,-22,-63,-28,-91,-60,64,27,-41,27,73,-37,-12,69,68,-30,-83,-31,-63,-24,-68,-36,30,-3,-23,-59,-70,-68,-94,57,12,-43,-30,-74,-22,20,-85,-38,-99,25,-16,-71,-14,-27,92,-81,-57,-74,-63,71,97,-82,-6,-26,85,-28,-37,-6,-47,-30,-14,-58,-25,-96,-83,-46,-15,-68,-35,-65,-44,-51,-88,-9,-77,-79,-89,-85,-4,-52,-55,-100,-33,-61,-77,-69,-40,-13,-27,-87,-95,-40};
    	int ans=o.maxSubArray(nums);
    	System.out.println(ans);
    }
}
