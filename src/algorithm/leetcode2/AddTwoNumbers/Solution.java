package algorithm.leetcode2.AddTwoNumbers;

public class Solution {
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		if(l1==null&&l2==null) {
			return null;
		}
		if(l1==null) {
			return l2;
		}
		if(l2==null) {
			return l1;
		}
		
		ListNode result = new ListNode(0);
		ListNode temp = result;
		
		while(true) {
			if(l1!=null) {
				temp.val = temp.val+l1.val;
				l1 = l1.next;
			}
			if(l2!=null) {
				temp.val = temp.val + l2.val;
				l2 = l2.next;
			}
			
			temp.next=new ListNode(temp.val/10);
			temp.val = temp.val%10;
			
			if(l1==null&&l2==null) {
				temp.next = (temp.next.val==0?null:temp.next);
				break;
			}
			
			temp = temp.next;
		}
		return result;
	}
	
	public static void main(String args[]) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 =new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode s = addTwoNumbers(l1,l2);
		//System.out.println("hahahaha");
		
		while(s!=null) {
			System.out.println(s.val);
			s=s.next;
		}
	}
}
