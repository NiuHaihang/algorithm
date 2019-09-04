package algorithm.leetcode23.MergeKList;


class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class MergeKList {
	public static ListNode mergeKLists(ListNode[] list) {
		if(list.length==0) return null;
		if(list.length==1) return list[0];
		if(list.length==2) return mergeTwoSortedLists(list[0],list[1]);
		int left =list.length/2;
		int right = list.length-left;
		ListNode ans = null;
		ListNode[] temp1=new ListNode[left];
		ListNode[] temp2=new ListNode[right];
		for(int i=0;i<left;i++) {
			temp1[i]=list[i];
		}
		for(int j=0;j<right;j++) {
			temp2[j]=list[left+j];
		}
		ans=mergeTwoSortedLists(mergeKLists(temp1),mergeKLists(temp2));
		return ans;

	}
	
	
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
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		node1.next=new ListNode(4);
		node1.next.next = new ListNode(5);
		
		ListNode node2 = new ListNode(1);
		node2.next = new ListNode(3);
		node2.next.next = new ListNode(4);
		
		ListNode node3 = new ListNode(2);
		node3.next = new ListNode(6);
		
		ListNode[] list = new ListNode[3];
		list[0]=node1;
		list[1]=node2;
		list[2]=node3;
		
		ListNode ans = mergeKLists(list);
		while(ans!=null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
}
