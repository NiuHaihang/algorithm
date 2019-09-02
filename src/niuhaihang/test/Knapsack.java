package niuhaihang.test;
/**
 *  CSDN blog https://blog.csdn.net/liu_c_y/article/details/53233869
 * @author niuhaihang
 *
 */
public class Knapsack {
    //01����
      public static void knapsack(int n,int m,int [] w,int [] v){
          int c[][] = new int[n+1][m+1]; //c[][]���
          for(int i = 0; i<=n;i++){  //��ʼ����һ��
            c[i][0] = 0;
          }
          for (int i = 0; i <= m; i++) {  //��ʼ����һ��
            c[0][i] = 0;
          }

          for(int i = 1;i<=n;i++){ //�м�����Ʒ�ͻ��м���Ҫ��
              for(int j=1;j<=m;j++){ //���������ж��ÿһ�оͻ�Ҫ������ٴ�
                  if(j<w[i]) c[i][j] = c[i-1][j]; //����������С�ڵ�i����Ʒ��������͵���ˣ�ֻ��͵ǰi-1����Ʒ
                  else{ //�������������ڵ�i����Ʒ������
                      int value1 = c[i-1][j]; //��͵
                      int value2 = c[i-1][j-w[i]]+v[i]; //͵
                      if(value1>value2) c[i][j] = value1;//�Ƚ�͵���ǲ�͵��i����Ʒ����
                      else c[i][j] = value2;
                  }
              }
          }

          for(int i = 0;i<=n;i++){
              for(int j=0;j<=m;j++){
                  System.out.print(c[i][j]+" "); 
              }
              System.out.println();
          }
      }

      public static void main(String[] args) {
          int w [] = new int[]{1,3,5,7,9,3,4,5,7,2,3,4,3,2};
          int v [] = new int[]{2,4,6,8,10,5,5,6,8,5,6,4,3,5};
          knapsack(13,40,w,v);
      }
}



