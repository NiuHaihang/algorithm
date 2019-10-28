package niuhaihang.test;

public class SubString {
	public static void main(String[] args) {
		String s ="10 7028b33ca8b2a1bdddb1dcd51794757d9639b9159e0f6e673d3baebeb34a06aa C:/Windows/system32/taskmgr.exe taskmgr.exe READ 1000 2019-10-12-09-46-16";
		int p1 = s.indexOf(" ");
		int p2 = s.indexOf(" ", p1 + 1);
		int p3 = s.indexOf(" ", p2+1);
		int p4 = s.indexOf(" ", p3+1);
		int p5 = s.indexOf(" ", p4+1);
		int p6 = s.indexOf(" ", p5+1);

		String unique = s.substring(p1 + 1, p4);
		System.out.println(unique);
		String measure = s.substring(p1 + 1, p2).toUpperCase();
		System.out.println(measure);
		String program = s.substring(p2 + 1, p3);
		System.out.println(program);
		String software = s.substring(p3 + 1, p4);
		System.out.println(software);
		String type = s.substring(p4 + 1, p5);
		System.out.println(type);
		int processID = Integer.parseInt(s.substring(p5 + 1, p6));
		System.out.println(processID);
		
	}
}
