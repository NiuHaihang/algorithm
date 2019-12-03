package niuhaihang.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		boolean flag=false;
		int i,j = 0;
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				/*
				 * if(j==2) { flag=true; break; }
				 */
			}
			if(flag) {
				break;
			}
		}
		System.out.println("i="+i+",j="+j);
    }
}
