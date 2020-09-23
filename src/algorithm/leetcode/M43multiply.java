package algorithm.leetcode;

public class M43multiply {
	public String multiply(String num1,String num2) {

		char[] num11= num1.toCharArray();
		int len1=num11.length;
		char[] num22=num2.toCharArray();
		int len2=num22.length;
		int[] ans=new int[len1+len2];
		for(int i=len2-1;i>=0;i--) {
			for(int j=len1-1;j>=0;j--) {
				int temp=(num11[j]-'0')*(num22[i]-'0');
				temp+=ans[i+j+1];
				ans[i+j]+=temp/10;
				ans[i+j+1]=temp%10;
			}
		}
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<ans.length-1&&ans[i]==0)
			i++;
		for(;i<ans.length;i++) {
			sb.append(ans[i]);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		M43multiply res=new M43multiply();
		String num1="123";
		String num2="456";
		String ans=res.multiply(num1, num2);
		System.out.println(ans);
	}
}
