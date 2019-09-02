package niuhaihang.test;

public class InsertSortError {
	public static void Insert(int[] arr,int x) {
		int i;
//		n=arr.length-1;
		for(i=arr.length-2;i>=0;i--) {
			if (x<arr[i]) arr[i+1]=arr[i];//从后往前依次挪动位置
			else break;//如果x比arr[i]的最后一位还大，直接插到最后
		}
		arr[i+1]=x;//插入到最后的位置
	}
	public static void InSort(int[] arr,int n){
		n=arr.length;
		for(int i=2;i<n;i++) {
			
			int t=arr[i];
			Insert(arr,t);
			
			}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {2,1,7,4,3,5,8,9,0};
		InSort(arr,arr.length);
	}

}