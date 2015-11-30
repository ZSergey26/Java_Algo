package Chapter_2_Sorting.HeapSort;

import StdLibs.StdOut;

/**
 * Created by Sergei Zarochentsev on 24.11.2015.
 */
public class Heap {
    public static void sort(Comparable[] a) {

        heapConstruction(a);

        sortdown(a);

    }

    private static void sortdown(Comparable[] a) {
        int N = a.length;

        while (N > 1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void heapConstruction(Comparable[] a) {
//        int N = a.length;
//        for (int k = N / 2; k >= 1; k--) {
//            sink(a, k, N);
//        }

        int N = a.length;
        for (int k = 1; k < N; k++) {
            swim(a, k, N);
        }

    }

    private static void exch(Object[] a, int i, int j) {
        Object t = a[i - 1];
        a[i - 1] = a[j - 1];
        a[j - 1] = t;
    }

    private static void sink(Comparable[] a, int k, int N) {

        while (2 * k <= N) {
            int j = 2 * k;

            if (j < N && less(a, j, j + 1)) {
                j++;
            }

            if (!less(a, k, j)) {
                break;
            }

            exch(a, k, j);

            k = j;
        }
    }

    private static void swim(Comparable[] a, int k, int N) {
        while (k > 1 && less(a, k / 2, k)) {
            exch(a, k / 2, k);
            k = k /2;
        }
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i - 1].compareTo(a[j - 1]) < 0;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] a = {4, 3, 1, 2, 10, 5, 4, 4, 1, 9, 0};
        Heap.sort(a);
        show(a);
    }
}
