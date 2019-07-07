package com.ln.algr;

import java.util.Scanner;

/**
 * @Description 第34页习题解答
 * @Author HeZhipeng
 * @Date 2019/7/7 20:24
 **/
public class Exercise1 {


    /**
     * 习题1.1.11
     *
     * @param a
     */
    public static void printDoubleArr(boolean[][] a) {

        for (int i = 0; i < a.length; i++) {
            boolean[] b = a[i];
            System.out.print("第:" + (i + 1) + "行>>");
            for (int j = 0; j < b.length; j++) {
                System.out.print("第：" + (j + 1) + "列,");
                if (b[j]) {
                    System.out.print("*,");
                } else {
                    System.out.print(" ,");
                }
            }

            System.out.println();
        }


    }


    /**
     * 习题1.1.13，矩阵转置
     *
     * @param source
     */
    public static void doMatrixTransposes(int[][] source) {

        System.out.println("转置前");
        printMatrix(source);
        int[][] dest = new int[source[0].length][source.length];
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                dest[j][i] = source[i][j];
            }

        }

        System.out.println("转置后");
        printMatrix(dest);

    }

    /**
     * 打印一个二维数组
     *
     * @param a
     */
    public static void printMatrix(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }


    /**
     * 习题1.1.14
     *
     * @param N
     * @return
     */
    public static int lg(int N) {

        int x = 2;
        int y = 0;
        if (N == 0) {
            throw new IllegalArgumentException("N 不能为负");
        }
        if (N == 1) {
            return y;
        }
        for (int i = 1; i <= N; i++) {
            if (x > N) {
                return y;
            } else {
                x *= 2;
                y = i;
            }
        }
        return y;
    }


    /**
     * 习题1.1.15
     *
     * @param a
     * @return
     */
    public static int[] histogram(int[] a, int M) {

        int[] b = new int[M];
        for (int i = 0; i < b.length; i++) {
            int data = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    data++;
                }
            }
            b[i] = data;
            data = 0;
        }

        return b;
    }


    /**
     * 习题1.1.16
     *
     * @param n
     * @return
     */
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }


    /**
     * 习题1.1.18
     * @param a
     * @param b
     * @return
     */
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }


    /**
     * 习题 1.1.20
     *  lnN! = ln N + ln(N-1)+ ... + ln1;
     * @param X = N!
     * @return
     */
    public static Double lnN(Long X){

        if (X < 1) throw new IllegalArgumentException("N!不能小于1");
        if (X == 1) return 0d;
        return Math.log(X) + lnN(X - 1);

    }


    /**
     * 习题1.1.21
     */
    public static void printTable(){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String next = scanner.next();
            String[] split = next.split(",");
            int a = Integer.valueOf(split[1]);
            int b = Integer.valueOf(split[2]);
            System.out.println(String.format("名字：%s, %s, %s, %.3f", split[0], split[1], split[2], (a / 1.0 / b)));

        }


    }


    /**
     * 二分查找
     * @param key
     * @param arr
     */
    public static void binarySearch(int key, int[] arr){

        



    }



    public static void main(String[] args) {

        // 测试习题1.1.11
//        boolean[] b1 = new boolean[]{true, false, true};
//        boolean[] b2 = new boolean[]{false, true, false};
//        boolean[] b3 = new boolean[]{true, false, true};
//        boolean[][] a = new boolean[][]{b1, b2, b3};
//        printDoubleArr(a);

        // 测试习题1.1.13
//        int[] a1 = new int[]{1, 2, 3};
//        int[] a2 = new int[]{4, 5, 6};
//        int[][] source = new int[][]{a1, a2};
//        doMatrixTransposes(source);

        // 测试习题1.1.14
//        System.out.println(lg(-8));

        // 测试习题1.1.15
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = histogram(a, 6);
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + ",");
//        }
//        System.out.println();

        // 测试1.1.16
//        System.out.println(exR1(6));
        // 测试1.1.18
//        System.out.println(mystery(2, 25));
//        System.out.println(mystery(3, 11));


        // 测试1.1.20
//        System.out.println(lnN(3l));

        // 测试1.1.21
//        printTable();



    }


}
