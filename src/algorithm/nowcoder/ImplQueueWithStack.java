package algorithm.nowcoder;

import java.util.Stack;

public class ImplQueueWithStack {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	int ans = 0;
    	if(stack1.isEmpty()) {
    		System.out.println("Empty Queue!");
    	}else {
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    		ans = stack2.pop();
    		while(!stack2.isEmpty()) {
    			stack1.push(stack2.pop());
    		}
    	}
    	return ans;
    }
}
