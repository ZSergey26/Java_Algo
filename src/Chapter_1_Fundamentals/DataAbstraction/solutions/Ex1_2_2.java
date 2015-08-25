package Chapter_1_Fundamentals.DataAbstraction.solutions;

import Chapter_1_Fundamentals.DataAbstraction.Interval1D;
import StdLibs.StdRandom;

import java.util.ArrayList;

/**
 * Created by Sergei Zarochentsev on 25.08.2015.
 */
public class Ex1_2_2 {

    private static final int MAX_LEFT = 20;
    private static final int MAX_RIGHT = 100;

    private static final int DEFAULT_N = 10;

    public static void main(String[] args) {
        int N;
        if(args.length == 0)
            N = DEFAULT_N;
        else
            N = Integer.parseInt(args[0]);

        ArrayList<Interval1D> intervals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            intervals.add( new Interval1D(StdRandom.uniform(MAX_LEFT), StdRandom.uniform(MAX_RIGHT + 20)) );
        }

        for (int i = 0; i < N; i++) {
            Interval1D interval1 = intervals.get(i);
            for (int j = 0; j < N; j++) {
                if( i == j)
                    continue;

                Interval1D interval2 = intervals.get(j);

                if(isIntersects(interval1, interval2))
                {
                    System.out.println("Intervals " + interval1 + " and " + interval2 + " is intersects");
                }
            }
        }
    }

    private static boolean isIntersects(Interval1D interval1, Interval1D interval2)
    {
        return interval1.intersects(interval2);
    }
}
