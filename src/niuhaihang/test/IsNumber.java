package niuhaihang.test;

public class IsNumber {
	public boolean isNumber(String s) {
		if(s.length() == 0) return false;
		if(s.length() == 1) {
			return Character.isDigit(s.charAt(0));
		}
		int cnt1 = 0,cnt2 = 0,cnte = 0,cnt4 = 0;
		//cnt1表示+号数量，cnt2表示-号数量，cnte表示e/E数量，cnt4表示其它非数字的字符数量
		int indexe = -1,index1 = -1,index2=-1;
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!Character.isDigit(c) && c == '+') {
				cnt1++;
				index1 = i;
			}
			else if(!Character.isDigit(c) && c == '-') {
				cnt2++;
				index2 = i;
			}
			else if(!Character.isDigit(c) && (c=='e'||c=='E')) {
				cnte++;
				indexe = i;
			}else if(!Character.isDigit(c)){
				cnt4++;
			}
		}
		if(s.charAt(0)=='+'||s.charAt(0)=='-') {
			if(cnte == 0) {
				if(cnt1>0||cnt2>0) return false;
			}
			if(cnte > 1) return false;
			if(cnte == 1) {
				if(cnt1+cnt2 >1) return false;
				
				if(index1 == -1&&index2 == -1) {
					return cnt4>0;
				}
				if(index1 == -1) {
					return cnt2==1&&index2-indexe==1;
				}
				if(index2 == -1) {
					return cnt1==1&&index1-indexe==1;
				}
			}
		}
		if(Character.isDigit(s.charAt(0))) {
			if(cnte == 0) {
				if(cnt1>0||cnt2>0) return false;
			}
			if(cnte>1) return false;
			if(cnte == 1) {
				if(cnt1+cnt2 >1) return false;
				if(index1 == -1&&index2 == -1) {
					return cnt4>0;
				}
				if(index1 == -1) {
					return cnt2==1&&index2-indexe==1;
				}
				if(index2 == -1) {
					return cnt1==1&&index1-indexe==1;
				}
			}
		}
		return true;
	}
}
