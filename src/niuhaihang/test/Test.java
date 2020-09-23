package niuhaihang.test;

<<<<<<< HEAD
import java.security.SecureRandom;
import java.util.concurrent.*;
import java.util.Arrays;
public class Test{
	static int a =1;
	static int b = 2;
	public static void main(String[] args){
		int a[]={10,2,9,8,90};
		for(int n=0;n<6;n++){
			for(int i=0 ;i<a.length ;i++){
				int a3=(int)(Math.random()*(a.length-1));
				int a4=a[i];
				a[i]=a[a3];
				a[a3]=a4;
			}	
			
			for(int m=0;m<a.length;m++){
				System.out.println(a[m]);
			}
		}
	}
=======
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void test() {
		List<Integer> testList=new ArrayList<>(5);
		testList.add(1);
		System.out.println(testList.size());
		testList.add(2);
		System.out.println(testList.size());
	}
	
	public static void main(String[] args) throws InterruptedException{
		test();
    }
>>>>>>> bab3337bfedb564d5d21fbdae44ebba6b2b28fa5
}

