package niuhaihang.test;
/**
 *  CSDN blog https://blog.csdn.net/liu_c_y/article/details/53233869
 * @author niuhaihang
 *
 */
public class Knapsack {
    //01背包
      public static void knapsack(int n,int m,int [] w,int [] v){
          int c[][] = new int[n+1][m+1]; //c[][]表格
          for(int i = 0; i<=n;i++){  //初始化第一行
            c[i][0] = 0;
          }
          for (int i = 0; i <= m; i++) {  //初始化第一列
            c[0][i] = 0;
          }

          for(int i = 1;i<=n;i++){ //有几件商品就还有几行要填
              for(int j=1;j<=m;j++){ //背包容量有多大每一行就还要计算多少次
                  if(j<w[i]) c[i][j] = c[i-1][j]; //当背包容量小于第i件商品的重量，偷不了，只能偷前i-1件商品
                  else{ //当背包容量大于第i件商品的重量
                      int value1 = c[i-1][j]; //不偷
                      int value2 = c[i-1][j-w[i]]+v[i]; //偷
                      if(value1>value2) c[i][j] = value1;//比较偷还是不偷第i件商品划算
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



