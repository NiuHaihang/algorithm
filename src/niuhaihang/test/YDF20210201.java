package niuhaihang.test;
import java.util.*;
public class YDF20210201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] square = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				square[i][j] = sc.nextInt();
			}
		}
		long res = solve(square);
		System.out.println(res);
	}
	public static long solve(int[][] nums) {
		long res = 0;
		
		return res;
	}
}
