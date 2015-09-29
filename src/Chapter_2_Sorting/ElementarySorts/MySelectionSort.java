package Chapter_2_Sorting.ElementarySorts;

import java.util.Arrays;

/**
 * Created by Sergei Zarochentsev on 28.09.2015.
 */
public class MySelectionSort {
    private static int findMin(int from, int[] a) {
        int minPosition = 0;
        int min = Integer.MAX_VALUE;
        for (int i = from; i < a.length; i++) {
            if(a[i] <= min) {
                min = a[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static void sort(int[] a) {
        int position;
        for (position = 0; position < a.length; position++) {
            int currMin = findMin(position, a);

            int buf = a[position];
            a[position] = a[currMin];
            a[currMin] = buf;

        }
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 9, 0, 1, 4, 5, 8, 7, 10, 2};
        System.out.println("a = " + Arrays.toString(a));

        sort(a);

        System.out.println("a = " + Arrays.toString(a));
    }
}
