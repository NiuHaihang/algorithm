package niuhaihang.test;

public class DoWhile {
	public void dowhile(int n) {
		int cnt=0;
		do {
			cnt++;
			System.out.println("while循环执行了"+cnt+"次");
		}while(cnt<n);
		System.out.println(cnt);

	}
	public void WHILE(int n) {
		int cnt=0;
		while(cnt<n) {
			cnt++;
			System.out.println("while循环执行了"+cnt+"次");
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		DoWhile ans=new DoWhile();
		ans.dowhile(0);
		ans.WHILE(0);
	}
}
