package niuhaihang.test;

//import java.lang.*;


public class BinarySearch {
	/**
	 * ʹ�õݹ�Ķ��ֲ���
	 * title:recursionBinarySearch
	 * @author niuhaihang
	 *@param arr ��������
	 *@param key �����ҵĹؼ���
	 *@return �ҵ���λ��
	 */
	public static int recursionBinarySearch(int[] arr,int key,int low,int high) {
		if (key<arr[low]||key>arr[high]||low>high) {
			return -1;
		}
		int middle =(low+high)/2;
		if(arr[middle]>key) {
			//�ȹؼ��ִ���ؼ�����������
			return recursionBinarySearch(arr,key,low,middle-1);	
		}else if(arr[middle]<key) {
			//�ȹؼ���С��ؼ�����������
			return recursionBinarySearch(arr,key,middle+1,high);
		}else {
				return middle;
		}
	}
	/**
	 * ��ʹ�õݹ�Ķ��ֲ���
	 * title:commonBinarySearch
	 * @param args
	 * @param arr
	 * @param key
	 * @return �ؼ���λ��
	 */
	public static int commonBinarySearch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		int middle=0;
		
		if(key<arr[low]||key>arr[high]||low>high) {
			return -1;
		}
		while(low<=high) {
			middle=(low+high)/2;
			if(arr[middle]>key) {
				//�ȹؼ��ִ���ؼ�����������
				high=middle-1;
			}else if(arr[middle]<key) {
				//�ȹؼ���С��ؼ�����������
				low=middle+1;
			}else {
				return middle;
			}
		}
		return -1;       //�����Ȼû���ҵ����򷵻�-1���������return -1����Ҫ�У�����ͻᱨ����ѭ���ڷ��ص�intֵ�ǲ��ܱ��������յġ�
	}
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,11};
		int key=5;
//		int position=recursionBinarySearch(arr,key,0,arr.length-1);
		
		int position=commonBinarySearch(arr,key);
		
		if(position==-1) {
			System.out.println("���ҵ���"+key+",������û�и�����");
		}else {
			System.out.println("���ҵ���"+key+"���ҵ�λ��Ϊ��"+position);
		}
//		System.out.println("Hello,world!");
	}
		
}
