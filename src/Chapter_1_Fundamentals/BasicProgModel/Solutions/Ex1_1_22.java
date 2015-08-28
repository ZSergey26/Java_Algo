package Chapter_1_Fundamentals.BasicProgModel.Solutions;

import StdLibs.StdRandom;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Sergei Zarochentsev on 09.08.2015.
 */
public class Ex1_1_22 {
    static Logger myLogger = Logger.getLogger("binary.logger");

    public static void main(String[] args) {
        myLogger.setLevel(Level.ALL);
        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info("Main start");
        final int ARRAY_SIZE = 100;
        final int MAX_ELEM = 100;

        myLogger.fine("Fine!");
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = StdRandom.uniform(MAX_ELEM);
        }

        Arrays.sort(array);
        myLogger.warning("Array sorted");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        int KEY = 45;
        String result;
        result = binarySearch(0, array.length, array, KEY) ?  "Element found" :  "Element not found";
        System.out.println(result);

    }

    public static boolean binarySearch(int lo, int hi, int[] sortedArray, int key)
    {
        assert lo >= 0 : "Low < 0";
        System.out.println();
        System.out.println("Low = "  + lo + "       High: " + hi);
        if(hi - lo <= 1)
            return false;
        int mid = lo + (hi - lo) / 2;
        System.out.println("Mid element = " + sortedArray[mid] + "  at " + mid);
        if(key == sortedArray[mid])
            return true;

        if(key < sortedArray[mid]) {
            System.out.println("LEFT");
            return binarySearch(lo, mid, sortedArray, key);
        }

        if(key > sortedArray[mid]) {
            System.out.println("RIGHT");
            return binarySearch(mid, hi, sortedArray, key);
        }

        return false;
    }
}

