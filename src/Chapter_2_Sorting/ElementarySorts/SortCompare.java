package Chapter_2_Sorting.ElementarySorts;

import Chapter_1_Fundamentals.AnalysisOfAlgorithms.Stopwatch;
import StdLibs.StdOut;
import StdLibs.StdRandom;

/**
 * Created by Sergei Zarochentsev on 02.10.2015.
 */
public class SortCompare {
    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];

        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);

        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);

        StdOut.printf("Для %d случайных Doubles\n   %s в", N, alg1);
        StdOut.printf(" %.1f раз быстрее, чем %s\n", t2 / t1, alg2);
    }

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();

        if(alg.equals("Вставки")) new Insertion().sort(a);
        if(alg.equals("Выбор")) new Selection().sort(a);
        if(alg.equals("Шелла")) new Shell().sort(a);

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];

        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }

            total += time(alg, a);
        }

        return total;
    }

}
