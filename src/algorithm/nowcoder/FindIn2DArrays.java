package algorithm.nowcoder;

public class FindIn2DArrays {
	public boolean Find(int target,int[][] arrays) {
		if(arrays.length == 0) return false;
		if(arrays[0].length == 0) return false;
		int colLen = arrays.length;
		int rowLen = arrays[0].length;
		for(int i=colLen-1;i>=0;i--) {
			if(arrays[i][0]>target) continue;
			int ans = FindInRows(target,arrays,i,0,rowLen-1);
			if(ans != -1) return true;
		}
		return false;
	}
	
	public int FindInRows(int target,int[][] arrays,int row,int start,int end) {
		if(arrays[row][start] > target || arrays[row][end] < target || start > end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arrays[row][mid] > target) {
			return FindInRows(target,arrays,row,start,mid-1);
		}else if(arrays[row][mid] < target) {
			return FindInRows(target,arrays,row,mid+1,end);
		}else {
			return mid;
		}
	}
			
}
