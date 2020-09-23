package niuhaihang.test;

import java.util.*;
public class Sougou2020090501 {
	
	public int numberofprize (int a, int b, int c) {
        // write code here
		PriorityQueue<Integer> pq = new PriorityQueue<>((m,n)->(n-m));
		pq.offer(a);
		pq.offer(b);
		pq.offer(c);
		int res = 0;
		while(!pq.isEmpty()) {
			if(pq.size() == 3) {
				int first = pq.poll();
				int second = pq.poll();
				int third = pq.poll();
				if(first>1) pq.offer(first-1);
				if(second>1) pq.offer(second-1);
				if(third>1) pq.offer(third-1);
				res++;
			}
			else if(pq.size() == 2) {
				int first = pq.poll();
				int second = pq.poll();
				first -= 1;
				second -= 1;
				if(first+second<2) break;
				else {
					if(first > 2) {
						pq.offer(first-2);
					}else {
						pq.offer(first-1);
						pq.offer(second-1);
					}
					res++;
				}
				
			}
			else if(pq.size()==1) {
				int top = pq.poll();
				res+=top/6;
			}
		}
		return res;
    }
}
