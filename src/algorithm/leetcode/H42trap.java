package algorithm.leetcode;

public class H42trap {
	public int trap(int[] height) {
		if(height==null||height.length<=2) return 0;
		int[] lMaxHeight=new int[height.length];
		lMaxHeight[0]=height[0];
		int[] rMaxHeight=new int[height.length];
		rMaxHeight[height.length-1]=height[height.length-1];
		for(int i=1;i<height.length;i++) {
			if(height[i]>lMaxHeight[i-1])
				lMaxHeight[i]=height[i];
			else
				lMaxHeight[i]=lMaxHeight[i-1];
		}
		for(int j=height.length-2;j>=0;j--) {
			rMaxHeight[j]=(height[j]>rMaxHeight[j+1])?height[j]:rMaxHeight[j+1];
		}
		int area=0;
		for(int i=0;i<height.length;i++) {
			area+=(Math.min(lMaxHeight[i], rMaxHeight[i])-height[i]);
		}
		return area;
	}
	
	
	
	public static void main(String[] args) {
		H42trap res=new H42trap();
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		int ans=res.trap(height);
		System.out.println(ans);
	}
}
