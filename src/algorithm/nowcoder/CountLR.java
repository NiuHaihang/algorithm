package algorithm.nowcoder;

public class CountLR {
	public int countLR(int[] a,int[] b) {
		//Ç°×ººÍ
		int cnt = 0;
        int len = a.length;
        int[][] sum = sum(a);
        for(int l=0;l<len;l++) {
        	for(int width=1;width+l<len;width++) {
        		int temp = b[l]+b[l+width-1];
        		if(temp == sum[l][width]) {
        			cnt++;
        		}
        	}
        }
        /*for(int width=1;width<=len;width++){
        	for(int l=0;l<len&&(l+width-1)<len;l++){
            	int temp = b[l]+b[l+width-1];
                if(temp == sum[l][l+width-1]) {
                	cnt++;
                }
            }
        }*/
        return cnt;
	}
	public int sum(int[] nums,int l,int r){
        int ans = 0;
        for(int i=l;i<=r;i++){
            ans += nums[i];
        }
        return ans;
    }
	
	public int[][] sum(int[] nums){
		int len = nums.length;
		int[][] ans = new int[len][len];
		int width = 1;
		for(int l=0;l<len;l++) {
			int temp = 0;
			for(width=1;l+width<len;width++) {
				temp += nums[l+width-1]; 
				ans[l][width] = temp;
			}
			
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] a = {99,25,93,28,29,78,91,85,67,67,54,41,66,39,4,33,57,68,45,56,77,0,94,13,67,72,62,15,17,36,12,30,97,52,76,17,21,99,62,46,97,55,26,8,4,6,46,86,47,47,51,21,60,18,79,85,97,28,76,60,87,48,36,74,51,69,28,8,48,78,62,18,83,4,6,73,10,99};
		int[] b = {1509,118,1240,571,1190,1631,1539,241,152,656,813,246,940,389,211,1937,330,1822,1830,1051,1070,1584,540,1412,1798,1649,1374,492,1590,1072,8,234,1765,1419,348,1881,317,1927,431,1446,991,1595,42,1203,1132,1301,1130,1655,1421,84,1760,444,1148,220,1186,671,1977,1861,920,1380,806,1676,1072,527,491,1073,75,1052,1667,263,750,648,1661,1591,386,949,1276,1038};
		CountLR res = new CountLR();
		int ans = res.countLR(a, b);
		System.out.println(ans);
	}
}
