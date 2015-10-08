package Chapter_2_Sorting.ElementarySorts;

/**
 * Created by Sergei Zarochentsev on 29.09.2015.
 */
public class Insertion extends SortingFundamentalOperations {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less( a[j], a[j-1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        new Insertion().test();
    }
}
