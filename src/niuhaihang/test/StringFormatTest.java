package niuhaihang.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class StringFormatTest {
		public static void main(String[] args) {
			float floatVar = 1.3f;
			int intVar = 1;
			String stringVar = "abc";
			System.out.printf("浮点型变量的值为:"+
								"%f,整型变量的值为:"+
								"%d,字符串变量的值为: "+
								"is %s \n",floatVar,intVar,stringVar);
			
			String fs;
			fs = String.format("浮点型变量的值为:"+"%f,整型变量的值为:"+"%d,字符串变量的值为: "+"is %s", floatVar,intVar,stringVar);
			System.out.print(fs);
			
		}
}
