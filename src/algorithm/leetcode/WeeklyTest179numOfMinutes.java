package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WeeklyTest179numOfMinutes {
	public int numOfMinutes(int n,int headID,int[] manager,int[] informTime) {
		Map<Integer,Integer> childmap = new HashMap();
		for(int i=0;i<n;i++) {
			
			if(!childmap.containsKey(manager[i])) {
				childmap.put(manager[i], i);
			}
			childmap.put(manager[i],i);
		}
		return 0;
	}
}
