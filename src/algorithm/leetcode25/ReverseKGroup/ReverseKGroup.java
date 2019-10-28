package algorithm.leetcode25.ReverseKGroup;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
}

public class ReverseKGroup {
	public static ListNode reverseKGroup(ListNode head,int k) {
		if(head==null) return null;
		if(head.next==null) return head;
		ListNode current = head;//当前结点
		ListNode prev=null;//当前节点的前一个结点
		ListNode Next=null;//当前结点的下一个结点
		ListNode temp=head;//用来判断链表长度的临时变量
		int count=0;
		while(temp!=null&&count<k) {
			temp=temp.next;
			count++;
		}
		
		if(count==k) {
			int i=0;
			while(i<k) {
				Next=current.next;//Next记录了当前结点的下一个结点，就是Next的索引指向了当前结点的下一个结点
				current.next=prev;//令当前结点的next指针指向它的前一个结点
				prev=current;//令prev的索引指向当前结点，相当于pre后移
				current=Next;//当前结点后移到下一个结点（当前结点的索引指向下一个结点）
				i++;
			}
			if(Next!=null) {
				head.next=reverseKGroup(Next,k);//head是翻转后的尾结点
			}
			
			return prev;//prev在上面的第三步指向了当前结点，current在第四步指向了下一个结点，已经不在当前的k个结点内
		}
		else
			return head;//链表长度小于K的话直接返回表头

	}
	
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		ListNode ansNode=reverseKGroup(head,2);
		while(ansNode!=null) {
			System.out.println(ansNode.val);
			ansNode=ansNode.next;
		}
	}
}
