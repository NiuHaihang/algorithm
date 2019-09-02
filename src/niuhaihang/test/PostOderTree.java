package niuhaihang.test;

import java.util.Stack;

public class PostOderTree {

	public static void PostOrder(TreeNode p) {
		TreeNode r = null;
		Stack<TreeNode> s = new Stack<>();
		while(p!=null || !s.isEmpty()) {
			if(p!=null) {
				s.push(p);
				p = p.left;
			}
			else {
				if(s.peek().right!=null&&s.peek().right!=r) {
					p=s.peek();
					p=p.right;
					s.push(p);
					p=p.left;
				}
				else {
					p=s.pop();
					System.out.println(p.id);
					r=p;
					p=null;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
		for(int i = 0; i < 10; i++)
		{
			node[i] = new TreeNode(i);
		}
		for(int i = 0; i < 10; i++)
		{
			if(i*2+1 < 10)
				node[i].left = node[i*2+1];
			if(i*2+2 < 10)
				node[i].right = node[i*2+2];
		}
		PostOrder(node[0]);
	}
}
class TreeNode{
	int id;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int id) {
		this.id = id;
		// TODO 自动生成的构造函数存根
	}
	
}
