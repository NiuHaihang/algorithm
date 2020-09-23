package algorithn.datastructure.trietree;

public class Main {
	public static void main(String[] args) {
		TrieTree tree=new TrieTree();
		tree.insert("aa");
		tree.insert("aa");
		tree.insert("ab");
		tree.insert("ba");
		System.out.println(tree.root);
		System.out.println(tree.size());
		System.out.println(tree.getStringNum("aa"));
		System.out.println(tree.getStringNum("ab"));
		System.out.println(tree.getStringNum("ac"));
		System.out.println(tree.getPrefixNum("a"));
		System.out.println(tree.getPrefixNum("b"));
		System.out.println(tree.getPrefixNum("c"));
	}
}
