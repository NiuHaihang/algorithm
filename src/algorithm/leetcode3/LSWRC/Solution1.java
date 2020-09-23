package algorithm.leetcode3.LSWRC;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public int lengthOfLongestSubString(String s) {
		int n = s.length(), ans = 0;
        //����map����,iΪ�����䣬jΪ�����䣬�ұ߽��ƶ�
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            // ��������а�����ǰ�ַ���
            if (map.containsKey(s.charAt(j))) {
                //��߽��ƶ��� ��ͬ�ַ�����һ��λ�ú�i��ǰλ���и����ҵ�λ�ã�������Ϊ�˷�ֹi�����ƶ�
                i = Math.max(map.get(s.charAt(j)), i);
            }
            //�ȶԵ�ǰ���ظ��ֶγ��Ⱥʹ���ĳ��ȣ�ѡ���ֵ���滻
            //j-i+1����Ϊ��ʱi,j�����Դ��ڲ��ظ���λ�ã�j��û������ƶ���ȡ��[i,j]����
            ans = Math.max(ans, j - i + 1);
            // ����ǰ�ַ�Ϊkey����һ������Ϊvalue����map��
            // valueΪj+1��Ϊ�˵������ظ��ַ�ʱ��iֱ�������ϸ���ͬ�ַ�����һ��λ�ã�if��ȡֵ�Ͳ���+1��
            map.put(s.charAt(j), j+1);
        }
        return ans;
	}
	
	public static void main(String[] args) {
		Solution1 res= new Solution1();
		int ans = res.lengthOfLongestSubString("dvdf");
		System.out.println(ans);
	}
}
