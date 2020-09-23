package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	 public Stack<Integer> stack = new Stack<Integer>();
	    public int minNum;
	    public int index = 0;
	    public List<Integer> minList = new ArrayList();
	    
	    
	    public int min(){
	        return minNum;
	    }
	    
	    public void push(int num){
	        if(stack.isEmpty()){
	            minNum = num;
	            stack.push(num);
	        }else{
	            if(minNum > num){
	                minNum = num;
	            }
	            stack.push(num);
	        }
	    }
	    
	    public int pop(){
	        int head = stack.pop();
	        return head;
	    }
	    
	    public static void main(String[] args){
	        MinStack minstack = new MinStack();
	        int Q,op;
	        Scanner in = new Scanner(System.in);
	        Q = in.nextInt();
	        while(Q-->0){
	            op = in.nextInt();
	            if(op == 0){
	                System.out.println(minstack.min());
	            }else if(op == 1){
	                minstack.push(in.nextInt());
	            }else if(op == 2){
	                System.out.println(minstack.pop());
	            }
	        }
	    }
}	
