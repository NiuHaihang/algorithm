package algorithm.leetcode21.MergeTwoSortedLists;

public class MergeTwoSortedLists1 {
	public static ListNode mergeTwoSortedLists(ListNode l1,ListNode l2) {
		if(l1==null&&l2==null) return null;
		else if(l1==null) return l2;
		else if(l2==null) return l1;
		ListNode ans=null;
		ListNode temp=null;
		if(l1.val<l2.val) {
			ans=l1;
			temp=l1;
			l1=l1.next;
		}
		else {
			ans=l2;
			temp=l2;
			l2=l2.next;
		}
		while(l1!=null&l2!=null) {
			if(l1.val<l2.val) {
				temp.next=l1;
				temp=temp.next;
				l1=l1.next;
			}
			else {
				temp.next=l2;
				temp=temp.next;
				l2=l2.next;
			}
		}
		if(l1!=null) {
			temp.next=l1;
		}
		if(l2!=null) {
			temp.next=l2;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		System.out.println("hahahah");
		ListNode ans = mergeTwoSortedLists(l1, l2);
		
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
		
	}
}
