package com.algorithm;

/**
 * 动态规划
 * 案例：背包问题
 */
public class KnapsackProblem {

    public static void main(String[] args) {

        /**
         * 物品的重量
         */
        int[] w = {1,4,3};

        /**
         * 物品的价值
         */
        int[] v = {1500,3000,2000};

        /**
         * 物品的个数
         */
        int n = w.length;

        /**
         * 背包的容量
         */
        int m = 4;

        //val[i][j]表示在前i个物品中能够装入容量为j的背包中的最大价值，可在i个物品挑选放入容量为j的背包
        int[][] val = new int[n+1][m+1];

        //为了记录放入商品的情况，我们定一个二维数组
        int[][] path = new int[n+1][m+1];

        //初始化第一行和第一列,这里在本程序中，可以不去处理，因为默认就是0
        for(int i = 0; i < val.length; i++){

            //将第一列设置为0
            val[i][0] = 0;
        }
        for(int i = 0; i < val[0].length; i++){

            //将第一行设置0
            val[0][i] = 0;
        }

        //根据前面得到公式来动态规划处理
        //不处理第一行i是从1开始的
        for(int i = 1; i < val.length; i++) {
            //不处理第一列,j是从1开始的
            for (int j = 1; j < val[0].length; j++) {
                // 公式
                if (w[i-1] > j) {
                    //因为我们程序i是从1开始的，因此原来公式中的w[i]修改成w[i-1]
                    val[i][j] = val[i - 1][j];
                } else {

                    //val[i][j] = Math.max(val[i-1][j], v[i-1] + val[i-1][j-w[i-1]]);

                    if(val[i-1][j] < v[i-1]+val[i-1][j-w[i-1]]){
                        val[i][j] = v[i-1]+val[i-1][j-w[i-1]];
                        //把当前的情况记录到path
                        //则表示将w[i-1]装入背包中
                        path[i][j] = 1;
                    }else{
                        val[i][j]=val[i-1][j];
                    }
                }
            }
        }


        //输出一下看看目前的情况
        for(int i = 0; i < val.length; i++){
            for(int j = 0; j < val[0].length;j++){
                System.out.print(val[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for(int i = 0; i < path.length; i++){
            for(int j = 0; j < path[0].length;j++){
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }

        int i = path.length-1;//行的最大下标
        int j = path[0].length-1;//列的最大下标
        while(i > 0 && j > 0){//从path的最后开始找
            if(path[i][j] == 1){
                System.out.printf("第%d个商品放入到背包\n",i);
                j-=w[i-1];
            }
            i--;
        }
    }
}
