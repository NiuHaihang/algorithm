package algorithm.nowcoder;

import java.util.ArrayList;

class ListNode{
	int val;
	ListNode next = null;
	ListNode(int val){
		this.val = val;
	}
}

public class PrintListFromTailToHead {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> tempList = new ArrayList();
		while(listNode != null) {
			tempList.add(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> ansList = new ArrayList(tempList.size());
		for(int i=tempList.size()-1;i>=0;i--) {
			ansList.add(tempList.get(i));
		}
		return ansList;
	}
	
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		PrintListFromTailToHead test = new PrintListFromTailToHead();
		ArrayList<Integer> ansList = test.printListFromTailToHead(listNode);
		System.out.println(ansList.toString());
	}
}
