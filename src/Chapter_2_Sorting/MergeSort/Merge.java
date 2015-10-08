package Chapter_2_Sorting.MergeSort;

import Chapter_2_Sorting.ElementarySorts.SortingFundamentalOperations;

/**
 * Created by Sergei Zarochentsev on 08.10.2015.
 */
public class Merge extends SortingFundamentalOperations {

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private static int SortCounter = 0;
    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {

            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);

    }

    public static void main(String[] args) {
        new Merge(){}.test();
    }
}
