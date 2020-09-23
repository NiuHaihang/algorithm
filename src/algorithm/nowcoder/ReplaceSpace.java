package algorithm.nowcoder;

public class ReplaceSpace {
	public String replaceSpace(StringBuffer str) {
		int index = str.indexOf(" ");
		if(index == -1) return str.toString();
		while(index!=-1) {
			str = str.replace(index, index+1, "%20");
			index = str.indexOf(" ");
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		ReplaceSpace rs = new ReplaceSpace();
		StringBuffer sb = new StringBuffer("We Are Happpy!");
		String ans = rs.replaceSpace(sb);
		System.out.println(ans);
	}
}
