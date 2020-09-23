package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WeekTest165numOfBugers {
	public List<Integer> numOfBugers(int tomatoSlices,int cheeseSlices){
		List<Integer> ans=new ArrayList<>();
		if((tomatoSlices-2*cheeseSlices)<0||(tomatoSlices-4*cheeseSlices)>0) return ans;
		int total_jumb=0,total_small=0;
		if((tomatoSlices-2*cheeseSlices)%2==0) {
			total_jumb=(tomatoSlices-2*cheeseSlices)/2;
			total_small=cheeseSlices-total_jumb;
			ans.add(total_jumb);
			ans.add(total_small);
			return ans;
		}else
			return ans;
	}
}
