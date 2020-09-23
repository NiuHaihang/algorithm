package algorithm.leetcode;

import java.util.Arrays;

public class WeeklyTest5170validateBinaryTreeNodes {
	public boolean validateBinaryTreeNodes(int n,int[] leftChild,int[] rightChild) {
		int leftChildNum=0;
		int rightChildNum=0;
		for(int i=0;i<leftChild.length;i++) {
			if(leftChild[i]!=-1) {
				leftChildNum++;
			}
		}
		for(int i=0;i<rightChild.length;i++) {
			if(rightChild[i]!=-1) {
				rightChildNum++;
			}
		}
		if(leftChildNum+rightChildNum+1!=n) return false;
		int[] nodes = new int[n];
		for(int i=0;i<leftChild.length;i++) {
			if(leftChild[i]!=-1) {
				nodes[leftChild[i]]++;
			}
		}
		for(int i=0;i<rightChild.length;i++) {
			if(rightChild[i]!=-1) {
				nodes[rightChild[i]]++;
			}
		}
		System.out.println(Arrays.toString(nodes));
		int zeroNum=0;
		int oneNum=0;
		int largerThanOneNum=0;
		for(int i=0;i<n;i++) {
			if(nodes[i]==0) {
				zeroNum++;
			}else if(nodes[i]==1) {
				oneNum++;
			}else {
				largerThanOneNum++;
			}
		}
		if(zeroNum>1) return false;
		if(largerThanOneNum>0) return false;
		if(oneNum!=n-1) return false;
		return true;
	}
	public static void main(String[] args) {
		WeeklyTest5170validateBinaryTreeNodes test = new WeeklyTest5170validateBinaryTreeNodes();
		int n=6;
		int[] leftChild={1,-1,-1,4,-1,-1};
		int[] rightChild= {2,-1,-1,5,-1,-1};
		if(test.validateBinaryTreeNodes(n, leftChild, rightChild)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
