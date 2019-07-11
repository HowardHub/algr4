package content_2_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Description 排序的抽象类
 * @Author HeZhipeng
 * @Date 2019/7/11 21:06
 **/
public abstract class Sorter {


    /**
     * 留给各个具体的排序实现
     * @param a
     */
    public abstract  void sort(Comparable[] a);

    public boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public void show(Comparable[] a){

        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] +",");
        }
        StdOut.println();
    }


//    public boolean isSorted(Comparable[] a){
//
//        for (int i = 0; i < a.length; i++) {
//            if(!less(a[i], a[i++])){
//                return false;
//            }
//
//        }
//        return true;
//    }
//


    public boolean isSorted(Comparable[] a){
        // i从1开始，防止数组下标越界
        for (int i = 1; i < a.length; i++) {
            if(less(a[i], a[i-1])) return false;
        }
        return true;
    }




}
