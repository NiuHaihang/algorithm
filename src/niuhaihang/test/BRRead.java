package niuhaihang.test;

import java.io.*;

public class BRRead {
	public static void main(String[] args) throws IOException{
			int a = largestPrimeFactor(9);
			System.out.println(a);
	}
	public static int largestPrimeFactor(int a){
        int k = 2;
        while(k*k < a){
            if(a%k==0){
                a /= k;
            }else{
                k++;
            }
        }
        return a;
    }
}
