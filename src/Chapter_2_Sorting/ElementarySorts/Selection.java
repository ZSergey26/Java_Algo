package Chapter_2_Sorting.ElementarySorts;

/**
 * Created by Sergei Zarochentsev on 28.09.2015.
 */
public class Selection extends SortingFundamentalOperations {

    public void sort(Comparable[] a) {
        int N  = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if( less(a[j], a[min]) )
                    min = j;
            }
            exch(a, i, min);
        }
    }



    public static void main(String[] args) {
        new Selection(){}.test();
    }


}
