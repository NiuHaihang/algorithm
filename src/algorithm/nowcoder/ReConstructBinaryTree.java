package algorithm.nowcoder;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
}

public class ReConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
		System.out.println("hah");
		if(pre.length == 1 && in.length == 1) {
			return new TreeNode(pre[0]);
		}
		TreeNode ansNode = new TreeNode(pre[0]);
		int headNum = pre[0];
		int index = 0;
		for(int i=0;i<in.length;i++) {
			if(in[i] == headNum) {
				index = i;
				break;
			}
		}
		int leftLength = index;
		int rightLength = in.length-1-index;
		
		if(leftLength != 0) {
			int[] leftpre = new int[leftLength];
			int[] leftin = new int[leftLength];
			for(int i=0;i<leftLength;i++) {
				leftpre[i] = pre[1+i];
				leftin[i] = in[i];
			}
			ansNode.left = reConstructBinaryTree(leftpre,leftin);
		}
		
		if(rightLength != 0) {
			int[] rightpre = new int[rightLength];
			int[] rightin = new int[rightLength];
			for(int i=0;i<rightLength;i++) {
				rightpre[i] = pre[index+1+i];
				rightin[i] = in[index+1+i];
			}
			ansNode.right = reConstructBinaryTree(rightpre,rightin);
		}
	
		return ansNode;
	}
	
	public static void main(String[] args) {
		ReConstructBinaryTree rcb = new ReConstructBinaryTree();
		int[] pre = {1,2,4,3,5,6};
		int[] in = {4,2,1,5,3,6};
		TreeNode ansNode = rcb.reConstructBinaryTree(pre, in);
		printTree(ansNode);
	}
	public static void printTree(TreeNode t) {
		if(t == null) return;
		Queue<TreeNode> q = new LinkedList();
		q.add(t);
		while(!q.isEmpty()) {
			TreeNode tempNode = q.poll();
			if(tempNode.left != null ) q.add(tempNode.left);
			if(tempNode.right != null ) q.add(tempNode.right);
			System.out.print(tempNode.val);
		}
	}
}
