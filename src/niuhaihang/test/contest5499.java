package niuhaihang.test;

import java.util.Arrays;

public class contest5499 {
	public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        if(m*k > n) return false;
        if(k == 0) return true;
        int cnt = 0;
        for(int i = 0; i < n-m*k; i++){
            int[] pattern = Arrays.copyOfRange(arr,i,i+m);
            int num = count(arr,pattern,i,m);
            if(num >= k) return true;
        }
        return false;
    }
    
    public int count(int[] arr,int[] pattern, int start,int m){
        int cnt = 0;
        for(int i = start; i < arr.length-m; i++){
            if(equal(pattern,Arrays.copyOfRange(arr,i,i+m))) cnt++;
        }
        return cnt;
    }
    public boolean equal(int[] left,int[] right){
        for(int i = 0; i < left.length; i++){
            if(left[i] != right[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
    	
    }
}
