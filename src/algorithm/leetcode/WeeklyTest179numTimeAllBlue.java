package algorithm.leetcode;

public class WeeklyTest179numTimeAllBlue {
	public int numTimesAllBlue(int[] light) {
		int cnt=0;
        boolean[] flag = new boolean[light.length];
		for(int i=0;i<light.length;i++) {
            flag[light[i]-1]=true;
			if(isBlue(i,flag)) cnt++;
		}
		return cnt;
	}
	
	public boolean isBlue(int n,boolean[] flag) {
		for(int i=0;i<=n;i++) {
			if(flag[i]) continue;
			else return false;
		}
		return true;
	}
}
