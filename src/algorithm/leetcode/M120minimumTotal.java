package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class M120minimumTotal {
	public int minimumTotal(List<List<Integer>> triangle) {
        
        int height = triangle.size();
        int[][] dp = new int[height][height];
        dp[0][0] = triangle.get(0).get(0);
        for(int i=1;i<height;i++){
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }

        for(int i=1;i<height;i++){
        	dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
        }

        for(int i=2;i<height; i++){
            for(int j=1; j<i; j++){
            	dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
            }
        }

        int minSum = dp[height-1][0];
        for(int i = 0; i < height; i++){
            if(dp[height-1][i] < minSum) minSum = dp[height-1][i];
        }

        return minSum;
    }

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList();
		List<Integer> l1 = new ArrayList();
		List<Integer> l2 = new ArrayList();
		List<Integer> l3 = new ArrayList();
		List<Integer> l4 = new ArrayList();
		l1.add(2); l2.add(3); l2.add(4);
		l3.add(6); l3.add(5); l3.add(7); l4.add(4); l4.add(1); l4.add(8); l4.add(3);
		triangle.add(l1); triangle.add(l2); triangle.add(l3); triangle.add(l4);
		M120minimumTotal res = new M120minimumTotal();
		res.minimumTotal(triangle);
	}
}
