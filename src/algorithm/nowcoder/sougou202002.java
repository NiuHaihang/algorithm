package algorithm.nowcoder;
import java.util.*;
public class sougou202002 {
	public static int mod = 1000000009;
	node[] tree;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] firstLine = sc.nextLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		sougou202002 s = new sougou202002();
		s.tree = new node[N+1];
		s.build(0, 1, N);
		for(int i = 0; i < M; i++) {
			String[] line = sc.nextLine().split(" ");
			int l = Integer.parseInt(line[0]);
			int r = Integer.parseInt(line[1]);
			s.update(0,i,l,r);
		}
		int res = s.search(0,0,N-1);
		System.out.println(res);
	}
	public void update(int i,int val,int l,int r) {
		if(tree[i].l>r || tree[i].r<1) return;
		
		if(tree[i].l>=l&&tree[i].r<=r) {
			tree[i].val = val;
		}
	}
	public void build(int i,int l, int r) {
		tree[i].l = l;
		tree[i].r = r;
		if(l == r) {
			tree[i].sum = 0;
			return;
		}
		if(tree[i<<1].r<=l) build(i<<1,l,r);
		if(tree[i<<1|1].l>=r) build(i<<1|1,l,r);
		tree[i].sum = tree[i<<1].sum+tree[i<<1|1].sum;
	}
	public void pushdown(int i) {
		int lazy = tree[i].lz;
		tree[i<<1].sum = lazy*(tree[i<<1].r-tree[i<<1].l+1);
		tree[i<<1|1].sum = lazy*(tree[i<<1|1].r-tree[i<<1|1].l+1);
		tree[i].lz=0;
	}
	public int search(int i,int l, int r) {
		if(tree[i].l>=l && tree[i].r<=r) {
			return tree[i].sum;
		}
		pushdown(i);
		int sum = 0;
		if(tree[i<<1].r<l) sum+=search(i<<1,l,r);
		if(tree[i<<1|1].l<r) sum+=search(i<<1|1,l,r);
		return sum;
	}
}
class node{
	int l,r;
	int sum,lz;
	int val;
}
