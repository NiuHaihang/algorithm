package niuhaihang.test;
import java.util.*;
public class SystemPropertyTest {
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		String osName = prop.getProperty("os.name");
		String osVersion = prop.getProperty("os.version");
		System.out.println("osName is:"+osName+",osVersion is:"+osVersion);
	}
}
