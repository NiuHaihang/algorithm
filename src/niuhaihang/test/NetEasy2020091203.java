package niuhaihang.test;
import java.util.*;
public class NetEasy2020091203 {
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n-1];
		for(int i = 0; i <n-1; i++) {
			nums[i] = sc.nextInt();
		}
		int res = solve(nums,k);
		System.out.println(res);
	}
	public static int solve(int[] nums,int k) {
		int n = nums.length;
		Map<Integer,List<Integer>> adj = new HashMap<>();
		for(int i = 0; i < n; i++) {
			adj.computeIfAbsent(i+1, unused->new ArrayList<Integer>()).add(nums[i]);
			adj.computeIfAbsent(nums[i], unused-> new ArrayList<Integer>()).add(i+1);
		}
		int res = bfs(adj,k);
		return res;
	}
	public static int bfs(Map<Integer,List<Integer>> adj,int k) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
		while(!q.isEmpty()) {
			
		}
		return 0;
	}
}
