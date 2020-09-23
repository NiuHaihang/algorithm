package algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class M133cloneGraph {
	public Node cloneGraph(Node node) {
        Map<Node,Node> resMap = new HashMap();
        Queue<Node> queue = new LinkedList();
        queue.add(node);
        while(!queue.isEmpty()) {
        	Node tempNode = queue.remove();
        	for(Node n : tempNode.neighbors) {
        		if(!resMap.containsKey(tempNode)) {
        			resMap.put(n, new Node(n.val,new ArrayList()));
        			queue.add(n);
        		}
            	resMap.get(tempNode).neighbors.add(resMap.get(n));
        	}

        }
        
        return resMap.get(node);
    }
}
