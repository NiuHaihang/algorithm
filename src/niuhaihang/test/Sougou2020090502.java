package niuhaihang.test;

public class Sougou2020090502 {
	/**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能创建的房屋数
     * @param t int整型 要建的房屋面宽
     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
     * @return int整型
     */
    public int getHouses (int t, int[] xa) {
        // write code here
    	int res = 2;
    	for(int i = 0; i < xa.length-2;i+=2) {
    		int left = xa[i]+xa[i+1]/2;
    		int right = xa[i+2]-xa[i+3]/2;
    		if(right-left<t) {
    			continue;
    		}else if(right-left == t) {
    			res+=1;
    		}else {
    			res+=2;
    		}
    	}
    	return res;
    }
    public static void main(String[] args) {
    	int[] xa = {-1,4,5,2};
    	Sougou2020090502 s = new Sougou2020090502();
    	int res = s.getHouses(2, xa);
    	System.out.println(res);
    }
}
