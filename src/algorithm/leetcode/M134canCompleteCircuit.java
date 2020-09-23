package algorithm.leetcode;

public class M134canCompleteCircuit {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int len = gas.length;
        int total = 0;
        int res = 0;
        int index = 0;
        for(int i=0;i<len;i++){
            total += gas[i]-cost[i];
            res += gas[i]-cost[i];
            if(res < 0){
                index = i+1;
                res = 0;
            }
        }
        return total >= 0 ?index : -1;
    }
}
