package Chapter_2_Sorting.MergeSort;

import Chapter_2_Sorting.ElementarySorts.SortingFundamentalOperations;

/**
 * Created by Sergei Zarochentsev on 12.10.2015.
 */
public class MergeBU extends SortingFundamentalOperations {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];

        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public static void main(String[] args) {
        new MergeBU().test();
    }
}
