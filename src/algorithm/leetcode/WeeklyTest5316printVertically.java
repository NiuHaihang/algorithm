package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WeeklyTest5316printVertically {
	public List<String> printVertically(String s){
		String[] tempString = s.split(" ");
		int maxlen=0;
		for(int i=0;i<tempString.length;i++) {
			if(maxlen<=tempString[i].length()) {
				maxlen=tempString[i].length();
			}
		}
		StringBuilder[] ansString = new StringBuilder[maxlen];
		for(int i=0;i<maxlen;i++) {
			ansString[i] = new StringBuilder();
		}
		for(int i=0;i<maxlen;i++) {
			for(int j=0;j<tempString.length;j++) {
				if(tempString[j].length()>=i+1) {
					ansString[i].append(tempString[j].charAt(i));
				}else {
					ansString[i].append(' ');
				}
			}
		}
		List<String> ansList = new ArrayList<String>();
		for(int i=0;i<ansString.length;i++) {
			String s1=trimEnd(ansString[i].toString());
			ansList.add(s1);
		}
		return ansList;
	}
	
	public String trimEnd(String s) {
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		for(int i=len-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				continue;
			}else {
				sb.append(s.substring(0,i+1));
				break;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		WeeklyTest5316printVertically ans=new WeeklyTest5316printVertically();
		String s= "TO BE OR NOT TO BE  ";
		List<String> ansList = ans.printVertically(s);
		//String s1=ans.trimEnd(s);
		System.out.println(ansList.toString());
	}
}
