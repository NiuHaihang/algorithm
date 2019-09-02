package algorithm.leetcode11.ContainerwithMostWater;

public class MaxArea {
	public static int maxArea(int[] height) {
		/*int m = 0;						//wrong answer
		int i = 0, j = height.length-1;
        while(i < j){
            m = Math.max(m, Math.min(height[i], height[j])*(j - i));
            while(height[i] <= height[j] && i < j) i++;
            while(height[j] <= height[i] && i < j) j--;
        }
		return m;*/
		
		int m = 0;
		int i = 0, j = height.length-1;
        while(i < j){
            int h = Math.min(height[i],height[j]);
            m = Math.max(m, h*(j - i));
            while(height[i] <= h && i < j) i++;
            while(height[j] <= h && i < j) j--;
        }
		return m;
	}
	public static void main(String args[]) {
		int t[] = new int[9];
		t[0] = 1;
		t[1] = 8;
		t[2] = 6;
		t[3] = 2;
		t[4] = 5;
		t[5] = 4;
		t[6] = 8;
		t[7] = 3;
		t[8] = 7;
		int m = maxArea(t);
		System.out.println(m);
		
	}
	
}
