package Chapter_2_Sorting.QuickSort;

import Chapter_2_Sorting.ElementarySorts.SortingFundamentalOperations;
import StdLibs.StdRandom;

import java.util.Comparator;

/**
 * Created by Sergei Zarochentsev on 15.10.2015.
 */
public class Quick extends SortingFundamentalOperations {
    @Override
    public void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        Comparable v = a[lo];

        while (true) {
            while ( less( a[++i], v ) )
                if( i == hi )
                    break;

            while ( less(v, a[--j] ) )
                if ( j == lo )
                    break;

            if( i >= j)
                break;

            exch(a, i , j);
        }

        exch(a, lo, j);
        return j;
    }


    public static void main(String[] args) {

    }
}
