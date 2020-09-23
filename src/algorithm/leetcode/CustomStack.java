package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
	int maxSize;
	int size;
	int[] customStack;
	public CustomStack(int maxSize) {
		this.maxSize=maxSize;
		this.size=0;
		customStack = new int[maxSize];
	}
	public void push(int x) {
		if(size>=maxSize) {
			return;
		}
		size++;
		customStack[size-1]=x;
		
	}
	public int pop() {
		if(size==0) return -1;
		return(customStack[--size]);
	}
	public void increment(int k,int val) {
		if(size<=k) {
			for(int i=0;i<size;i++) {
				customStack[i]+=val;
			}
		}else {
			for(int i=0;i<k;i++) {
				customStack[i]+=val;
			}
		}
	}
	
}
