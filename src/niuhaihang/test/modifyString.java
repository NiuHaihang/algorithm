package niuhaihang.test;

public class modifyString {
	public String modifyString(String s) {
		if(s.length() == 1) {
			if(s.equals("?")) {
				return "a";
			}else {
				return s;
			}
		}
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        while(index<s.length()) {
        	if(s.charAt(index) == '?') {
        		int next = index+1;
        		while(next<s.length() && s.charAt(next)=='?') next++;
        		if(next == s.length()) {
        			if(index>0) {
        				for(int i = index; i< next; i++) {
        					setchar(sb,i,i-1);
        					//sb.setCharAt(i, (char) (sb.charAt(i-1)+1));
        				}
        			}else {
        				sb.setCharAt(0, 'a');
        				for(int i = 1; i < next; i++) {
        					setchar(sb,i,i-1);
//        					sb.setCharAt(i, (char) (sb.charAt(i-1)+1));
        				}
        			}
        		}else {
        			for(int i = next-1; i>=index;i--) {
        				setchar(sb,i,i+1);
//        				sb.setCharAt(i, (char) (sb.charAt(i+1)-1));
        			}
        			if(index>0&&sb.charAt(index-1)==sb.charAt(index)) {
        				setchar(sb,index,index-1);
//        				sb.setCharAt(index, (char) (sb.charAt(index)+2));
        			}
        		}
        		index = next;
        	}
        	index++;
        }
        return sb.toString();
    }
	public void setchar(StringBuilder sb,int index1,int index2) {
		char c = (char) ('a'+(sb.charAt(index2)+1-'a')%26);
		sb.setCharAt(index1, c);
	}
}
