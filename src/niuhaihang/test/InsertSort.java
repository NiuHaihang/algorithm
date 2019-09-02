package niuhaihang.test;

public class InsertSort {
	/**
	 * 分成两步写
	 * @param arr
	 * @param x
	 * @param n
	 */
	public static void Insert(int[] arr,int x,int n) {
		int i;
//		n=arr.length-1;
		for(i=n-1;i>=0;i--) {
			if (x<arr[i]) arr[i+1]=arr[i];//从后往前依次挪动位置
			else break;//如果x比arr[i]的最后一位还大，直接插到最后
		}
		arr[i+1]=x;//插入到最后的位置
	}
	public static void InSort(int[] arr,int n){
		n=arr.length;
		for(int i=1;i<n;i++) {
			int t=arr[i];
			Insert(arr,t,i);
			}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
	/**
	 * 一个函数
	 * @param args
	 */
	public static void InSort1(int[] arr,int n) {
		n=arr.length;
		for(int i=1;i<n;i++) {
			int t=arr[i];
			int j;
			for (j=i-1;j>=0;j--) {//记住这里为什么是从i-1开始，对比着两步完成的方法来看
				if(t<arr[j]) arr[j+1]=arr[j];
				else break;
			}
			arr[j+1]=t;
		}
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {2,1,7,4,3,5,8,9,0};
		InSort(arr,arr.length);
		System.out.println();
		InSort1(arr,arr.length);
	}

}
