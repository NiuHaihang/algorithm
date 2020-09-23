package niuhaihang.test;

public class minCost {
	public static int minCost(String s, int[] cost) {
		if(s.length() == 1) return 0;
		int res = 0;
		int index = 0;
		while(index < s.length()) {
			if(index<s.length()-1 && s.charAt(index)==s.charAt(index+1)) {
				System.out.println("index="+index+",s.charAt(index)="+s.charAt(index));
				int next = index+1;
				while(next<s.length() && s.charAt(index)==s.charAt(next)) {
					if(cost[index]<cost[next]) {
						res += cost[index];
						index = next;
					}else {
						res += cost[next];
						index = next;
					}
					next++;
				}
				
			}else {
				index++;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		String s = "bbbaaa";
		int[] cost = {4,9,3,8,8,9};
		int res = minCost(s,cost);
		System.out.println(res);
	}
}
