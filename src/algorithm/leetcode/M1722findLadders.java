package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class M1722findLadders {
	public List<String> findLadders(String beginWord, String endWord, List<String> wordList) {
		List<String> ansList = new ArrayList<>();
        if(!wordList.contains(endWord) || beginWord.length()!=endWord.length()) return ansList;
        
        return ansList;
    }
}	
