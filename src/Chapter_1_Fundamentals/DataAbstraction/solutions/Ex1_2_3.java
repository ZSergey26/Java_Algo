package Chapter_1_Fundamentals.DataAbstraction.solutions;

import Chapter_1_Fundamentals.DataAbstraction.Interval1D;
import Chapter_1_Fundamentals.DataAbstraction.Interval2D;
import StdLibs.StdRandom;

import java.util.ArrayList;

/**
 * Created by Sergei Zarochentsev on 25.08.2015.
 */
public class Ex1_2_3 {

    private static final int DEFAULT_N = 10;
    private static final int LEFT = 10;
    private static final int RIGHT = 10;

    public static void main(String[] args) {
        int N;
        if(args.length == 0)
            N = DEFAULT_N;
        else
            N = Integer.parseInt(args[0]);


        ArrayList<Interval2D> intervals = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            double left;
            double right;
            while(true) {
                left = StdRandom.uniform();
                right = StdRandom.uniform();

                if(left < right)
                    break;
            }
            Interval1D interval1 = new Interval1D(left, right);


            double left2;
            double right2;
            while(true) {
                left2 = StdRandom.uniform();
                right2 = StdRandom.uniform();

                if(left2 < right2)
                    break;
            }
            Interval1D interval2 = new Interval1D(left2, right2);

            Interval2D interval = new Interval2D(interval1, interval2);

            intervals.add(interval);
        }


       for(Interval2D interval : intervals)
        {
            System.out.println(interval);
            interval.draw();
        }

        String str1 = "hello";
        String str2 = str1;

        str1 = "world";

        System.out.println(str1);
        System.out.println(str2);
    }
}
