package niuhaihang.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MidTraverse {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ansList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            if(stack.peek().left != null){
                stack.push(stack.peek().left);
            }else{
                TreeNode tempNode = stack.pop();
                ansList.add(tempNode.val);
                if(tempNode.right != null){
                    stack.push(tempNode.right);
                }
            }
        }
        int temp = Integer.MIN_VALUE;
        return ansList;
    }
	
	public static void main(String[] args) {
		
	}
}
