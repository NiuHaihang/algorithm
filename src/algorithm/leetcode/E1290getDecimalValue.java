package algorithm.leetcode;

import java.util.Stack;

public class E1290getDecimalValue {
	public int getDecimalValue(ListNode head) {
		Stack<Integer> stk = new Stack<>();
		while(head!=null) {
			stk.push(head.val);
			head=head.next;
		}
		int ans=0;
		int bit=0;
		while(!stk.empty()) {
			int temp=stk.pop();
			ans+=temp<<bit;
			bit++;
		}
		return ans;
	}
	public static void main(String[] args) {
		E1290getDecimalValue res = new E1290getDecimalValue();
		ListNode head = new ListNode(1);
		head.next=new ListNode(0);
		head.next.next = new ListNode(0);
		head.next.next.next= new ListNode(1);
		head.next.next.next.next= new ListNode(0);
		head.next.next.next.next.next = new ListNode(0);
		head.next.next.next.next.next.next = new ListNode(1);
		int ans =res.getDecimalValue(head);
		System.out.println(ans);
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
}
