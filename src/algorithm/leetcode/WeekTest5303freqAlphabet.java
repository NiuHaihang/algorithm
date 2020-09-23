package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WeekTest5303freqAlphabet {
	public String freqAlphabets(String s) {
		StringBuilder res = new StringBuilder();
		Map<String,Character> map = new HashMap<String, Character>();
		for(int i=1;i<=9;i++) {
			map.put(""+i,(char) ('a'+i-1));
		}
		for(int i=10;i<=26;i++) {
			map.put(i+"#", (char)('a'+i-1));
		}
		int cur=0;
		for(;cur<s.length()-2;) {
			if(s.charAt(cur+2)=='#') {
				StringBuilder tempsb = new StringBuilder();
				for(int j=cur;j<=cur+2;j++) {
					tempsb.append(s.charAt(j));
				}
				res.append(map.get(tempsb.toString()));
				cur+=3;
			}else {
				StringBuilder tempsb = new StringBuilder();
				tempsb.append(s.charAt(cur));
				res.append(map.get(tempsb.toString()));
				cur++;
			}
		}
		for(int i=s.length()-cur;i>0;i--) {
			res.append(map.get(s.charAt(s.length()-i)+""));
		}
		
		return res.toString();
	}
	public static void main(String[] args) {
		WeekTest5303freqAlphabet res = new WeekTest5303freqAlphabet();
		String anString = res.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#");
		System.out.println(anString);
	}
}
