package algorithn.datastructure.trietree;

public class TrieTree {
	//根节点
	TrieNode root;
	
	public TrieTree() {
		this.root = new TrieNode();
	}
	
	public void insert(String s) {
		if(s == null || s.length() == 0) return;
		TrieNode cur = root;
		for(Character c : s.toCharArray()) {
			if(cur.children.containsKey(c)) {
				cur.path++;
				cur = cur.children.get(c);
			}else {
				cur.path++;
				cur.children.put(c, new TrieNode());
				cur = cur.children.get(c);
			}
		}
		cur.path++;
		cur.end++;
	}
	/**
	 * 返回这个前缀树一共插入了多少个字符串
	 * @return
	 */
	public int size() {
		return root.path;
	}
	/**
	 * 返回这个前缀树中插入的指定字符串的次数，如果没有插入过，返回0
	 * @param s
	 * @return
	 */
	public int getStringNum(String s) {	
		if(s == null || s.length() == 0) return 0;
		TrieNode cur = root;
		for(Character c : s.toCharArray()) {
			if(cur.children.containsKey(c)) {
				cur = cur.children.get(c);
			}else {
				return 0;
			}
		}
		return cur.end;
	}
	
	public int getPrefixNum(String s) {
		if(s == null || s.length() == 0) return 0;
		TrieNode cur = root;
		for(Character c : s.toCharArray()) {
			if(cur.children.containsKey(c)) {
				cur = cur.children.get(c);
			}else {
				return 0;
			}
		}
		return cur.path;
	}
}
