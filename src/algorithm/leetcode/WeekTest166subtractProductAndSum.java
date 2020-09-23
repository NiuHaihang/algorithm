package algorithm.leetcode;

public class WeekTest166subtractProductAndSum {
	public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n!=0){
            product*=(n%10);
            System.out.println("product="+product);
            sum+=(n%10);
            System.out.println("sum="+sum);
            n/=10;
        }
        return product-sum;
    }
	public static void main(String[] args) {
		WeekTest166subtractProductAndSum res=new WeekTest166subtractProductAndSum();
		int ans=res.subtractProductAndSum(234);
		System.out.println(ans);
	}
}
