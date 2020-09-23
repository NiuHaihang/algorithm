package algorithm.luogu;
import java.util.*;
public class SegmentTree {
	int maxm = 100010;
	node[] tree = new node[maxm*4];
	int[] input = new int[maxm*4];
	public void build(int i, int l, int r) {
		tree[i].l = l;
		tree[i].r = r;
		tree[i].mlz = 1;
		if(l == r) {
			tree[i].sum = input[l];
		}
		int mid = (l+r)>>1;
		build(i<<1,l,mid);
		build(i<<1|1,mid+1,r);
		tree[i].sum = (tree[i<<1].sum+tree[i<<1|1].sum);
		return;
	}
	public void pushdown(int i) {
		int m=tree[i].mlz,p=tree[i].plz;
		tree[i<<1].sum = (tree[i<<1].sum*m+p*(tree[i<<1].r-tree[i<<1].l+1));
		tree[i<<1|1].sum = tree[i<<1|1].sum*m+p*(tree[i<<1|1].r-tree[i<<1|1].l+1);
		tree[i<<1].plz = tree[i<<1].plz*m+p;
		tree[i<<1|1].plz = tree[i<<1|1].plz*m+p;
		tree[i<<1].mlz = tree[i<<1].mlz*m;
		tree[i<<1|1].mlz = tree[i<<1|1].mlz*m;
		tree[i].plz = 0;
		tree[i].mlz = 1;
	}
	public void mul(int i,int l,int r,int k) {
		if(l>tree[i].r || r<tree[i].l) return;
		if(tree[i].l>=l && tree[i].r<=r) {
			tree[i].sum = tree[i].sum*k;
			tree[i].mlz = tree[i].mlz*k;
			tree[i].plz = tree[i].plz*k;
			return;
		}
		pushdown(i);
		if(tree[i<<1].r>=l) mul(i<<1,l,r,k);
		if(tree[i<<1|1].l<=r) mul(i<<1|1,l,r,k);
		tree[i].sum=tree[i<<1].sum+tree[i<<1|1].sum;
		return;
	}
	public void add(int i, int l, int r, int k) {
		if(l>tree[i].r || r<tree[i].l) return;
		if(tree[i].l>= l && tree[i].r<=r) {
			tree[i].sum +=(tree[i].r-tree[i].l+1)*k;
			tree[i].plz += k;
			return;
		}
		pushdown(i);
		if(tree[i<<1].r>=l) add(i<<1,l,r,k);
		if(tree[i<<1|1].l<=r) add(i<<1|1,l,r,k);
		tree[i].sum = tree[i<<1].sum+tree[i<<1|1].sum;
		return;
	}
	public int search(int i,int l,int r) {
		if(tree[i].r<l || tree[i].l>r) return 0;
		if(tree[i].l>=l&&tree[i].r<=r) {
			return tree[i].sum;
		}
		pushdown(i);
		int sum = 0;
		if(tree[i<<1].r>=l) sum+=search(i<<1,l,r);
		if(tree[i<<1|1].l<=r) sum+=search(i<<1|1,l,r);
		return sum;
	}
}
class node{
	int l,r;
	int sum,plz,mlz;
}
