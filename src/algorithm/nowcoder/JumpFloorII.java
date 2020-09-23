package algorithm.nowcoder;

import java.util.Arrays;

public class JumpFloorII {
	public int JumpFloorII(int target) {
        if(target == 0) return 0;
        if(target == 1) return 1;
        int[] solutions = new int[target+1];
        solutions[0]=1;
        solutions[1]=1;
        for(int i=2;i<=target;i++){
            solve(solutions,i);
        }
        System.out.println(Arrays.toString(solutions));
        return solutions[target];
    }
    public void solve(int[] solutions,int index){
        for(int i=0;i<index;i++){
            solutions[index]+=solutions[i];
        }
    }
    
    public static void main(String[] args) {
    	JumpFloorII jpf = new JumpFloorII();
    	int ans = jpf.JumpFloorII(3);
    	System.out.println(ans);
    }
}	
