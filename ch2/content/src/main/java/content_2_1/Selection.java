package content_2_1;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2019/7/11 21:17
 **/
public class Selection extends Sorter {





    public void sort(Comparable[] a) {

        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 第i个是最小值
            int min = i;

            // 寻找a[i,N-1]的最小值
            for (int j = i + 1 ; j < N ; j++) {
                if (less(a[j], a[j-1])) min = j;
            }

            // 能不能用另外一种实现？
//            for (int j = N - 1 ; j > i + 1 ; j--) {
//                if(less(j,j--)) min = j;
//
//            }
            // 将a[i]与最小值a[min]交换位置
            exch(a, i, min);
        }

    }


    public static void main(String[] args){
        Integer[] a = {3,5,4};

        Sorter sorter = new Selection();

        sorter.show(a);
        sorter.sort(a);
        sorter.show(a);


    }




}
