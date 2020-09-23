package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class M1268suggestedProducts {
	public static List<List<String>> suggestedProducts(String[] products,String searchWord){
		System.out.println(searchWord);
		List<List<String>> ansList=new ArrayList<>();
		if(products.length==0)
			return ansList;
		Arrays.sort(products);
		if(searchWord==null||"".equals(searchWord)) {
			return ansList;
		}
		int searchWordLen=searchWord.length();
		int productLen=products.length;
		for(int i=1;i<=searchWordLen;i++) {
			int count=0;
			List<String> tempList=new ArrayList<>();
			String prefix=searchWord.substring(0, i);
			for(int j=0;j<productLen;j++) {
				if(products[j].startsWith(prefix)) {
					tempList.add(products[j]);
					count++;
				}
				if(count>=3) break;
			}
			ansList.add(tempList);
		}
		
		return ansList;
	}
	
	public static void arraySort(String[] input) {
			for(int i=0;i<input.length-1;i++) {
				System.out.println("i="+i);
				if(isBiggerThan(input[i],input[i+1])) {
					String temp=input[i+1];
					input[i+1]=input[i];
					input[i]=temp;
				}
				for(String out:input) {
					System.out.print(out+" ");
				}
				System.out.println("");
			}
	}
	public static void arraySort1(String[] input) {
		for(int j=0;j<input.length-1;j++) {
			for(int i=0;i<input.length-1;i++) {
				if(input[i].compareTo(input[i+1])>0) {
					String temp=input[i];
					input[i]=input[i+1];
					input[i+1]=temp;
				}
			}
		}
		
	}
	
	public static boolean isBiggerThan(String first,String second) {
		if(first==null||second==null||"".equals(first)||"".equals(second)) {
			System.out.println("输入的字符不能为空");
			return false;
		}
		char[] firstString=first.toCharArray();
		char[] secondString=second.toCharArray();
		int minSize=Math.min(first.length(), second.length());
		for(int i=0;i<minSize;i++) {
			if((int)firstString[i]>(int)secondString[i])
				return true;
			else if((int)firstString[i]<(int)secondString[i]) {
				return false;
			}
		}
		if(first.length()>second.length())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String[] input=new String[] {"tmc","apad","apache","apab","nihao","nihaoa"};
		/*
		 * List<List<String>> ansList=suggestedProducts(input,"mouse");
		 * System.out.println(ansList.toString());
		 */
		arraySort(input);
		//System.out.println(input.toString());
		for(String out:input) {
			System.out.println(out);
		}
	}
}


