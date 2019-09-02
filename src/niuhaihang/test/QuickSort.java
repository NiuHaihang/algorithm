package niuhaihang.test;

public class QuickSort {
	public static void quickSort(int[] nums,int low,int high) {
		if(low < high) {
			int pos = partition(nums,low,high);
			//System.out.println("pos is: "+pos);
			quickSort(nums,low,pos-1);
			quickSort(nums,pos+1,high);
		}
	}
	
	public static int partition(int[] nums,int low,int high) {
		//System.out.println(low+","+high);
		int pos = low;
		int temp = nums[pos];
		while(low < high) {
			//System.out.println("                ");
			while(low < high && nums[high] >= temp) --high;
			nums[low] = nums[high];
			/*for(int i = 0;i < nums.length; i++) {
				System.out.println("第"+i+"个元素是"+nums[i]);
			}*/
			//System.out.println("                ");
			while(low < high && nums[low] <= temp) ++low;
			nums[high] = nums[low];
			/*for(int i = 0;i < nums.length; i++) {
				System.out.println("第"+i+"个元素是"+nums[i]);
			}*/
		}
		nums[low] = temp;
		/*System.out.println(low);
		for(int i = 0;i < nums.length; i++) {
			System.out.println("第"+i+"个元素是"+nums[i]);
		}*/
		return low;
	}
	public static void main(String args[]) {
		int[] a = {0,0,0};
		
		quickSort(a,0,a.length-1);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
