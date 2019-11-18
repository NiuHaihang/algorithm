package algorithm.leetcode;

public class E38countAndSay {
	public String countAndSay(int n) {
		String s=new String("1");
		for(int i=1;i<n;i++) {
			s=nextString(s);
		}
		return s;
	}
	
	public String nextString(String s) {
		StringBuilder sb=new StringBuilder();
		int count=1;
		int len=s.length();
		if(len==1) {
			return new String("11");
		}
		else for(int i=0;i<len;i++) {
			try {
				if(s.charAt(i)==s.charAt(i+1)) {
					count++;
					continue;
				}
				else {
					sb.append((char)(count+'0'));
					sb.append(s.charAt(i));
					count=1;
				}
			}catch(StringIndexOutOfBoundsException e) {
				if(s.charAt(len-1)==s.charAt(len-2))
					{
					sb.append((char)(count+'0'));
					sb.append(s.charAt(len-1));
					count=1;
					}
				else {
					sb.append((char)(count+'0'));
					sb.append(s.charAt(len-1));
					count=1;
				}
			}
				
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		E38countAndSay ans = new E38countAndSay();
		String ans1=ans.countAndSay(5);
		System.out.println(ans1);
	}
}
