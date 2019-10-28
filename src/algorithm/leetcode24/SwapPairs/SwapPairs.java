package algorithm.leetcode24.SwapPairs;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
}

public class SwapPairs {
	public static ListNode swapPairs(ListNode head) {
		if(head==null) return null;
		if(head.next==null) return head;
		ListNode ansNode = head.next;
		ListNode temp=ansNode.next;
		ansNode.next=head;
		head.next=swapPairs(temp);
		return ansNode;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next= new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		ListNode ans=swapPairs(head);
		while(ans!=null) {
			System.out.println(ans.val);
			ans=ans.next;
	}
	}
}