package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WeeklyTest185reformat {
	public String reformat(String s) {
		StringBuilder ansSb = new StringBuilder();
		int len = s.length();
		List<Character> charList = new ArrayList();
		List<Character> numList = new ArrayList();
		
		for(int i=0;i<len;i++) {
			if(isChar(s.charAt(i))) {
				charList.add(s.charAt(i));
			}else if(isNum(s.charAt(i))) {
				numList.add(s.charAt(i));
			}
		}
		
		if(Math.abs(charList.size()-numList.size())>1) {
			return ansSb.toString();
		}else if(charList.size()>numList.size()) {
			for(int i=0;i<numList.size();i++) {
				ansSb.append(charList.get(i));
				ansSb.append(numList.get(i));
			}
			ansSb.append(charList.get(charList.size()-1));
		}else if(charList.size()<numList.size()) {
			for(int i=0;i<charList.size();i++) {
				ansSb.append(numList.get(i));
				ansSb.append(charList.get(i));
			}
			ansSb.append(numList.get(numList.size()-1));
		}else {
			for(int i=0;i<numList.size();i++) {
				ansSb.append(numList.get(i));
				ansSb.append(charList.get(i));
			}
		}
		
		return ansSb.toString();
	}
	
	public boolean isChar(char c) {
		boolean flag = false;
		if((int)(c-'a')>=0 && (int)('z'-c) >=0) {
			flag = true;
		}
		return flag;
	}
	
	public boolean isNum(char c) {
		boolean flag = false;
		if((int)(c-'0')>=0 && (int)(c-'9')<=0){
			flag = true;
		}
		return flag;
	}
}
