package algorithm.leetcode;

public class WeekTest164minTimeVisitAllPoints {
	public int minTimeVistAllPoints(int[][] points) {
		if(points.length==0) return 0;
		int len=points.length;//len1是点的数目
		
		int time=0;
		for(int i=0;i<len-1;i++) {
			if(Math.abs(points[i][0]-points[i+1][0])>=Math.abs(points[i][1]-points[i+1][1])) {
				time+=Math.abs(points[i][0]-points[i+1][0]);
			}
			else
				time+=Math.abs(points[i][1]-points[i+1][1]);
		}
			
		return time;
		
	}

}
