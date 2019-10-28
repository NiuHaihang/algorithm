package algorithm.leetcode28.StrStr;

public class StrStr {
	public int strStr(String haystack,String needle) {
		if(needle==null) return 0;
		if(haystack==null) return -1;
		if(haystack.length()<needle.length()) return -1;
		int j=0,i=0;
		for(i=0;i<haystack.length();i++) {
			System.out.println("i="+i+"; "+"j="+j+";  "+needle.length());
			System.out.println(haystack.charAt(i));
			if(j==needle.length()) {
				return i-needle.length();
			}
			if(haystack.charAt(i)==needle.charAt(j)) {
				System.out.println(haystack.charAt(i));
				j++;
			}
			else {
				i=i-j;
				j=0;
			}
		}
		if(j==needle.length()) {
			return i-needle.length();
		}
		return -1;
		
	}
	public int[] Next(String s) {
		int len=s.length();
		int[] next=new int[len];
		next[0]=0;
		return next;
	}
	
	public static void main(String args[]) {
		StrStr ans=new StrStr();
		String hayback="hello";
		int ans1=ans.strStr("mississippi","issi");
		System.out.println(ans1);
	}
}
