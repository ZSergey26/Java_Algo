package Chapter_2_Sorting.ElementarySorts;

import StdLibs.StdOut;

import java.util.Arrays;

/**
 * Created by Sergei Zarochentsev on 28.09.2015.
 */
public abstract class Example {
    public void sort(Comparable[] a) {
        System.out.println("Base class sort call");
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]+ " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public  void test()
    {
        Integer[] a = {4, 3, 9, 0, 1, 4, 5, 8, 7, 10, 2};
        System.out.println("a = " + Arrays.toString(a));

        sort(a);

        System.out.println("a = " + Arrays.toString(a));
    }


}
