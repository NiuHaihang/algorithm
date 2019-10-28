package algorithm.leetcode;


public class Divide {
	public int divide(int dividend,int divisor) {
		if(dividend==0) return 0;
		if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
		boolean negative=(dividend^divisor)<0;
		long dividend1=Math.abs(dividend);
		long divisor1=Math.abs(divisor);
		int ans=0;
		for(int i=31;i>=0;i--) {
			if((dividend1>>i)>=divisor1) {
				ans+=1<<i;
				dividend1-=divisor1<<i;
				System.out.println("ans is:"+ans+" dividend is:"+dividend1);
			}
			System.out.println(dividend1>>i);
			System.out.println(divisor1);
		}
		
		return negative?-ans:ans;
	}
	
	public static void main(String[] args) {
		Divide d=new Divide();
		int ans = d.divide(-2147483648,2);
		System.out.println(ans);
	}
}
