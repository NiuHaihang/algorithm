package niuhaihang.test;

public class Print_Subset {
	public void print_subset(int n,int[] A,int cur) {
		for(int i=0;i<cur;i++) System.out.print(A[i]+" ");
		System.out.println("\n");
		int s = (cur==0)?0:A[cur-1]+1;
		for(int i=s;i<n;i++) {
			A[cur]=i;
			print_subset(n,A,cur+1);
		}
	}
	
	
	public static void main(String[] args) {
		int[] A= {2,5,7,5,9,0};
		Print_Subset ans=new Print_Subset();
		ans.print_subset(6, A, 0);
	}
}
