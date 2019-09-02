package niuhaihang.test;

//import java.lang.*;

public class MergeSort {
	static int number=0;
	public static void MergeSort1(int[] A,int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			MergeSort1(A,low,mid);
			MergeSort1(A,mid+1,high);
			Merge(A,low,mid,high);
		}
		else return;
}
	public static void Merge(int[] A,int low,int mid,int high) {
		int[] tmp=new int[A.length];
		int r1=mid+1;
		int tIndex=low;
		int cIndex=low;
		//逐个归并;
		while(low<=mid&&r1<=high) {
			if(A[low]<=A[r1])
				tmp[tIndex++]=A[low++];
			else tmp[tIndex++]=A[r1++];
		}
		//将左边剩余的归并
		while(low<=mid) {
			tmp[tIndex++]=A[low++];
		}
		//将右边剩余的归并
		while(r1<=high) {
			tmp[tIndex++]=A[r1++];
		}
		 System.out.println("第"+(++number)+"趟排序:\t");
		 //从临时数组拷贝到原数组
         while(cIndex<=high){
                A[cIndex]=tmp[cIndex];
                //输出中间归并排序结果
                System.out.print(A[cIndex]+"\t");
                cIndex++;
            }
         System.out.println();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {1,3,2,7,4,6,5,8,0,9};
		MergeSort1(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
