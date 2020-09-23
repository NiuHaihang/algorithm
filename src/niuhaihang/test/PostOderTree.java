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
					System.out.println(p.val);
					r=p;
					p=null;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode[] node = new TreeNode[10];//浠ユ暟缁勫舰寮忕敓鎴愪竴妫靛畬鍏ㄤ簩鍙夋爲
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
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int id) {
		this.val = id;
		// TODO 鑷姩鐢熸垚鐨勬瀯閫犲嚱鏁板瓨鏍�
	}
	
}
