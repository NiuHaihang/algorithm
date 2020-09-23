package niuhaihang.test;
import java.util.*;
public class YFD2020023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		int C = Integer.valueOf(f);
		for(int i = 0; i < C; i++) {
			String[] line = sc.nextLine().split(" ");
			int n = Integer.valueOf(line[0]);
			int[] nums = new int[n];
			for(int j = 0; j < n; j++) {
				nums[j] = Integer.valueOf(line[j+1]);
			}
			long res = solve(nums,n);
			System.out.println(res);
		}
	}
	public static long solve(int[] nums,int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
		for(int i :nums) {
			if(i>0) pq.offer(i);
		}
		if(pq.size()<3) return 0;
		long res = 0;
		int first=0,second=0,third=0;
		while(!pq.isEmpty()) {
			for(int i = 0; i < 3; i++) {
				if(pq.isEmpty()) {
					return res;
				}
				if(i==0) {
					first = pq.poll();
				}
				if(i==1) {
					second = pq.poll();
				}
				if(i==2) {
					third = pq.poll();
				}

			}
			res++;
			if(first>1) {
				pq.offer(first-1);
			}
			if(second>1) {
				pq.offer(second-1);
			}
			if(third>1) {
				pq.offer(third-1);
			}
		}
		return res;
	}
	
}

