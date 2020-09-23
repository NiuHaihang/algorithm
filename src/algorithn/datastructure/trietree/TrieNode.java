package algorithn.datastructure.trietree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	Map<Character,TrieNode> children;
	
	int path;//经过当前结点的字符串的个数（或者说是以这个结点为前缀的字符串的个数）
	
	int end;//以当前结点结束的字符串的个数
	
	public TrieNode() {
		this.path = 0;
		this.end = 0;
		children = new HashMap();
	}
	
	@Override
	public String toString() {
		return "TrieNode [path = "+ path +",end =" + end +",chilren = "+children.toString()+"]";
	}
}
