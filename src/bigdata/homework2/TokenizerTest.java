package bigdata.homework2;

import java.util.*;

public class TokenizerTest {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("Come/to/learn");
		System.out.println("Next token is: "+st.nextToken());
	}
}
