package algorithm.leetcode12.Int2Roma;

public class IntToRoma {
	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		
		String s1[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String s2[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String s3[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String s4[] = {"","M","MM","MMM"};
		int a=0, b=0, c=0, d=0;
		a = num/1000;
		b = (num/100)%10;
		c = (num/10)%10;
		d = num%10;
		sb.append(s4[a]).append(s3[b]).append(s2[c]).append(s1[d]);
		return sb.toString();
	}
	
}
