package algorithm.leetcode23.MergeKList;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class MergeKList {
	public ListNode mergeKLists(ListNode[] list) {
		int temp = list.length;
		return null;
	}
	
	public ListNode getMinNode(ListNode[] list) {
		int len = list.length;
		int ans = list[0].val;
		for(int i=0;i<len;i++) {
			if(list[i].val<ans)
				ans=list[i].val;
		}
		return new ListNode(ans);
	}
}
