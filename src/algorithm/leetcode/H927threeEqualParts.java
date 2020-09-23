package algorithm.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class H927threeEqualParts {
	public int[] threeEqualParts(int[] A) {
        int[] ans = new int[2];

        if(A.length <= 2) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int i = 0,j = A.length-1;
        while(i +1 < j){
            long left = sum(A,0,i);
            long mid = sum(A,i+1,j-1);
            long right = sum(A,j,A.length-1);
            System.out.println("left="+left+",mid="+mid+",right="+right);
            if(left == mid && mid == right){
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            if(left < right) i++;
            if(left > right) j--;
            if(left == right){
                if(left < mid){
                    j--;
                }else if(left > mid){
                    ans[0] = -1;
                    ans[1] = -1;
                    return ans;
                }
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
    long sum(int[] A,int i,int j){
        long ans = 0;
        for(int m = i; m <= j; m++){
            ans = ans << 1;
            ans += A[m];
        }
        return ans;
    }
    public static void main(String[] args) {
    	H927threeEqualParts res = new H927threeEqualParts();
    	int[] A = {0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,0,0,1,0,0,1,1,0,1,1,0,1,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,0,0,1,0,0,1,1,0,1,1,0,1,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,0,0,1,0,0,1,1,0,1,1,0,1,1,0,1,0};
/*    	int a = res.sum(A,0,2);
    	System.out.println(a);*/
    	int[] ans = res.threeEqualParts(A);
    	System.out.println(Arrays.toString(ans));
    }
}
