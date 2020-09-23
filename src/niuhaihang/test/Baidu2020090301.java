package niuhaihang.test;
import java.util.*;
public class Baidu2020090301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int cnt0 = 0,cnt5=0;
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] == 0) cnt0++;
			if(nums[i] == 5) cnt5++;
		}
		if(cnt0 == 0 || cnt5 < 9) {
			System.out.println(-1);
			return;
		}
		int cnt = cnt5/9;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= cnt; i++) {
			sb.append("555555555");
		}
		for(int i = 0; i < cnt0; i++) {
			sb.append('0');
		}
		System.out.println(sb);
	}
}
