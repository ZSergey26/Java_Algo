package Chapter_1_Fundamentals.BasicProgModel.Solutions;

import StdLibs.StdRandom;
import StdLibs.StdStats;

import java.util.Arrays;

/**
 * Created by Sergei Zarochentsev on 09.08.2015.
 */
public class Ex1_1_15 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 1000;
        final int MAX_ELEM = 100;

        int[] array = new int[ELEMENTS_COUNT];
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            array[i] = StdRandom.uniform(MAX_ELEM);
        }

        histogram(array);
    }

    public static void histogram(int[] array)
    {
        Arrays.sort(array);
        int max = StdStats.max(array);
        int min = StdStats.min(array);

        int[] stats = generate(min, max);
        int[] statistics = analyze(array, stats.length);
        plotData(statistics);


    }

    public static int[] generate(int min, int max)
    {
        int[] result = new int[max + 1];
        int index = 0;
        while(true)
        {
            result[index] = min;
            index++;
            if(index == max)
                break;
        }

        return result;
    }

    public static int[] analyze(int[] sortedArray, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i < sortedArray.length; i++) {
            result[sortedArray[i]]++;
        }

        return result;
    }

    public static void plotData(int[] stats)
    {
        for (int i = 0; i < stats.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < stats[i]; j++) {
                System.out.print("|");
            }
            System.out.print(stats[i]);
            System.out.println();
        }
    }

}
