package niuhaihang.test;

public class InsertSort {
	/**
	 * �ֳ�����д
	 * @param arr
	 * @param x
	 * @param n
	 */
	public static void Insert(int[] arr,int x,int n) {
		int i;
//		n=arr.length-1;
		for(i=n-1;i>=0;i--) {
			if (x<arr[i]) arr[i+1]=arr[i];//�Ӻ���ǰ����Ų��λ��
			else break;//���x��arr[i]�����һλ����ֱ�Ӳ嵽���
		}
		arr[i+1]=x;//���뵽����λ��
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
	 * һ������
	 * @param args
	 */
	public static void InSort1(int[] arr,int n) {
		n=arr.length;
		for(int i=1;i<n;i++) {
			int t=arr[i];
			int j;
			for (j=i-1;j>=0;j--) {//��ס����Ϊʲô�Ǵ�i-1��ʼ���Ա���������ɵķ�������
				if(t<arr[j]) arr[j+1]=arr[j];
				else break;
			}
			arr[j+1]=t;
		}
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] arr= {2,1,7,4,3,5,8,9,0};
		InSort(arr,arr.length);
		System.out.println();
		InSort1(arr,arr.length);
	}

}
