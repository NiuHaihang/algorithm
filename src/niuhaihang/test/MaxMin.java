package niuhaihang.test;

//import java.lang.*;

public class MaxMin {
//	private static int fmin;
//	public static void MaxMin(int A[],int max,int min) {
//		int fmax=A[0];int fmin=A[0];
//		for(int i=1;i<A.length;i++) {
//			if (A[i]>fmax) fmax=A[i];
//			else if(A[i]<fmin) fmin=A[i];
//		}
//		max=fmax;min=fmin;
//	}
	/**
	 * �����Ǵ���д��
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int A[]= {1,3,5,7,9,11,13};
		System.out.println("--------����һ-----------");
		int max=A[0];int min=A[0];
		for (int i=1;i<A.length;i++) {
			if(A[i]>max) max=A[i];
			else if(A[i]<min) min=A[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
		System.out.println("--------������-----------");
		int maxlocation=0;
		int minlocation=0;
		for(int i=1;i<A.length;i++) {
			if (A[i]>A[maxlocation]) maxlocation=i;
			else if(A[i]<minlocation) minlocation=i;
		}
		System.out.println("max="+A[maxlocation]+"λ��: "+maxlocation);
		System.out.println("min="+A[minlocation]+"λ��: "+minlocation);
		
//		System.out.println("--------������-----------");
		
}
}
