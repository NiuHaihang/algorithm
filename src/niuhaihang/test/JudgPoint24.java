package niuhaihang.test;

import java.util.ArrayList;
import java.util.List;

public class JudgPoint24 {
	public static final double EPSILON = 1e-6;
    public static final int TARGET = 24;
    public static int ADD=0,MUL=1,SUB=2,DIV = 3;
    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<>();
        for(int i:nums){
            list.add((double)i);
        }
        return dfs(list);
    }
    public boolean dfs(List<Double> list){
        if(list.size() == 0) return false;
        if(list.size() == 1){
            return Math.abs(list.get(0)-TARGET)<EPSILON;
        }
        int size = list.size();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i!=j){
                    List<Double> list2 = new ArrayList<>();
                    for(int k = 0; k < size; k++){
                        if(k!=i&&k!=j){
                            list2.add(list.get(k));
                        }
                    }
                    for(int k = 0; k < 4; k++){
                        if(k<2&&i>j){
                            continue;
                        }
                        if(k == 0){
                            list2.add(list.get(i)+list.get(j));
                        }else if(k==1){
                            list2.add(list.get(i)*list.get(j));
                        }else if(k ==2){
                            list2.add(list.get(i)-list.get(j));
                        }else{
                            if(Math.abs(list.get(j))<EPSILON){
                                continue;
                            }else{
                                list2.add(list.get(i)/list.get(j));
                            }
                        }
                        if(dfs(list2)){
                            return true;
                        }
                        list2.remove(list2.size()-1);
                    }
                }
            }
        }
        return false;
    }
}
