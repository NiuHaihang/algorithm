package niuhaihang.test;

import java.io.*;

public class BRRead {
	public static void main(String[] args) throws IOException{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下'q'键退出");
		//读取字符
		do {
			int x = br.read();
			System.out.println(x+'\n');
			c = (char) x;
			System.out.println(c);
		} while (c!='q');
	
	}
}
