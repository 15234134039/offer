package com.algorithm;

import java.util.Arrays;

/**
 * 迪杰斯特拉算法
 * 最短路径问题
 *
 * 1)战争时期，胜利乡有7个村庄(A,B,C,D,E,F,G)，现在有六个邮差，从G点出发，需要分别把邮件分别送到A,B,C,D,E,F六个村庄
 * 2)各个村庄的距离用边线表示(权)，比如A–B，距离5公里
 * 3)问：如何计算出G村庄到其它各个村庄的最短距离?
 * 4)如果从其它点出发到各个点的最短距离又是多少?
 */
public class DijkstraAlgorithm {

    public static void main(String[] args) {
        char[] vertex = {'A','B','C','D','E','F','G'};

        //邻接矩阵
        int[][] matrix = new int[vertex.length][vertex.length];

        //表示不可以连接
        final int N = 65535;

        matrix[0] = new int[]{N,5,7,N,N,N,2};
        matrix[1] = new int[]{5,N,N,9,N,N,3};
        matrix[2] = new int[]{7,N,N,N,8,N,N};
        matrix[3] = new int[]{N,9,N,N,N,4,N};
        matrix[4] = new int[]{N,N,8,N,N,5,4};
        matrix[5] = new int[]{N,N,N,4,5,N,6};
        matrix[6] = new int[]{2,3,N,N,4,6,N};

        //创建Graph对象
        Graph graph = new Graph(vertex,matrix);

        //测试,看看图的邻接矩阵是否ok
        //graph.showGraph();
    }
}

/**
 * 图
 */
class Graph{

    /**
     * 顶点数组
     */
    private char[] vertex;

    /**
     * 邻接矩阵
     */
    private int[][] matrix;

    public Graph(char[]vertex, int[][]matrix){
        this.vertex = vertex;
        this.matrix = matrix;
    }
}

/**
 * 已访问顶点集合
 */
class VisitedVertex{

    /**
     * 记录各个顶点是否访问过1表示访问过,0未访问,会动态更新
     */
    public int[] already_arr;

    /**
     * 每个下标对应的值为前一个顶点下标,会动态更新
     */
    public int[] pre_visited;

    /**
     * 记录出发顶点到其他所有顶点的距离,比如G为出发顶点，就会记录G到其它顶点的距离，会动态更新，求的最短距离就会存放到dis
     */
    public int[] dis;

    /**
     * 构造器
     * @param length 表示顶点的个数
     * @param index 出发顶点对应的下标,比如G顶点，下标就是6
     */
    public VisitedVertex(int length, int index){
        this.already_arr = new int[length];
        this.pre_visited = new int[length];
        this.dis = new int[length];

        //初始化dis数组
        Arrays.fill(dis,65535);

        //设置出发顶点被访问过
        this.already_arr[index]=1;

        //设置出发顶点的访问距离为0
        this.dis[index]=0;

    }
}
