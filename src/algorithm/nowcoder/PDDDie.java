package algorithm.nowcoder;
import java.util.*;

public class PDDDie {
	Map<Integer,Set<int[]>> map = new HashMap<>();
	public int[] rotate(int[] nums,int index,int direc){//������������ǰ��
		int[] res = new int[6];
		switch(index) {
			case 0://�̶�����
			{
				res[0] = nums[0];
				res[1] = nums[1];
				if(direc == 0) {//��ʱ��
					res[2] = nums[5];
					res[3] = nums[4];
					res[4] = nums[2];
					res[5] = nums[3];
				}else if(direc == 1) {//˳ʱ��
					res[2] = nums[4];
					res[3] = nums[5];
					res[4] = nums[3];
					res[5] = nums[2];
				}
				break;
			}
			case 1://�̶�����
			{
				res[2] = nums[2];
				res[3] = nums[3];
				if(direc == 0) {//��ʱ��
					res[0] = nums[5];
					res[1] = nums[4];
					res[4] = nums[0];
					res[5] = nums[1];
				}else if(direc == 1) {//˳ʱ��
					res[0] = nums[4];
					res[1] = nums[5];
					res[4] = nums[1];
					res[5] = nums[0];
				}
				break;
			}
			case 2://�̶�ǰ��
			{
				res[4] = nums[4];
				res[5] = nums[5];
				if(direc == 0) {//��ʱ��
					res[0] = nums[3];
					res[1] = nums[2];
					res[2] = nums[0];
					res[3] = nums[1];
				}else if(direc == 2) {//˳ʱ��
					res[0] = nums[2];
					res[1] = nums[3];
					res[2] = nums[1];
					res[3] = nums[0];
				}
				break;
			}
		}
		return nums;
	}
	public void process(int[][] data) {
		int len = data.length;
		for(int i = 0; i < len; i++) {
			int key = 0;
			for(int j = 0; j < 6; j++) {
				key = key*10+data[i][j];
			}
			for(int k = 0; k < 3; k++) {
				int[] tmp1 = rotate(data[i],k,0);
				int[] tmp2 = rotate(data[i],k,1);
			}
		}
	}
}
