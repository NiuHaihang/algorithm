package niuhaihang.test;
import java.util.*;
public class Sougou20200905 {
	/**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回生成的新密码个数
     * @param password string字符串 密码的数组字符串（长度小于50），例如 12345
     * @return long长整型
     */
	Set<String> set;
	long res;
    public long getPasswordCount (String password) {
        // write code here
    	set = new HashSet<>();
    	res = 0;
    	set.add(password);
    	for(int i = 0; i <= 9; i++) {
    		StringBuilder sb = new StringBuilder();
    		sb.append(i+"");
    		dfs(password,1,sb,i);
    		System.out.println(res);
    	}
    	return res;
    }
    public void dfs(String password,int cur,StringBuilder sb,int pre) {
    	if(cur == password.length()) {
    		if(!set.contains(sb.toString())) {
    			set.add(sb.toString());
    			System.out.println(set);
    			res++;
    		}
    		return;
    	}
    	int curnum = password.charAt(cur)-'0';
    	System.out.println("password="+password+",curnum="+curnum+",pre="+pre);
    	if((curnum+pre)%2==1) {
    		int tmp = (curnum+pre)/2;
    		sb.append(tmp);
    		dfs(password,cur+1,sb,tmp);
    		sb.deleteCharAt(sb.length()-1);
    		tmp = (curnum+pre)/2+1;
    		sb.append(tmp);
    		dfs(password,cur+1,sb,tmp);
    		sb.deleteCharAt(sb.length()-1);
    	}else {
    		int tmp = (curnum+pre)/2;
    		sb.append(tmp);
    		dfs(password,cur+1,sb,tmp);
    		sb.deleteCharAt(sb.length()-1);
    	}
    	
    }
    public static void main(String[] args) {
    	Sougou20200905 s = new Sougou20200905();
    	long res = s.getPasswordCount("123");
    	System.out.println(res);
    }
}
