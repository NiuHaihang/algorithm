package niuhaihang.test;

//import java.lang.*;

public class MaxAndMinDC {
	public static int MAX(int[] arr,int i,int j) {
		if (i==j) return arr[i];
		else {
			int mid=(i+j)/2;
			int leftmax=MAX(arr,i,mid);
			int rightmax=MAX(arr,mid+1,j);
			return leftmax>rightmax?leftmax:rightmax;
		}
	}
	public static int MIN(int[] arr,int i,int j) {
		if(i==j) return arr[i];
		else {
			int mid=(i+j)/2;
			int leftmin=MIN(arr,i,mid);
			int rightmin=MIN(arr,mid+1,j);
			return leftmin<rightmin?leftmin:rightmin;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {1,3,4,5,6,7,8,9,0};
		int max=MAX(arr,0,arr.length-1);
		int min=MIN(arr,0,arr.length-1);
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
