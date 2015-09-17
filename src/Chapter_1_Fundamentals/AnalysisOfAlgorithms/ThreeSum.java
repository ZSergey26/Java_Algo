package Chapter_1_Fundamentals.AnalysisOfAlgorithms;

import StdLibs.In;

/**
 * Created by Sergei Zarochentsev on 15.09.2015.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        System.out.println("count = " + count(a));
    }

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
