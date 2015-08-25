package Chapter_1_Fundamentals.DataAbstraction.solutions;

import Chapter_1_Fundamentals.DataAbstraction.Point2D;
import StdLibs.StdRandom;

import java.util.ArrayList;

/**
 * Created by Sergei Zarochentsev on 25.08.2015.
 */
public class Ex1_2_1 {

    private static final int MAX_X = 20;
    private static final int MAX_Y = 20;

    private static final int DEFAULT_N = 10;

    public static void main(String[] args) {
        int N;
        if(args.length == 0)
            N = DEFAULT_N;
        else
            N = Integer.parseInt(args[0]);

        System.out.println("Generate " + N + " points");

        ArrayList<Point2D> points = new ArrayList<>();
        for(int pointNum = 0; pointNum < N; pointNum++)
        {
            Point2D point = new Point2D(StdRandom.uniform(MAX_X), StdRandom.uniform(MAX_Y));
            points.add(point);
        }

        double minDistance = points.get(0).distanceTo(points.get(1));
        for(int point1 = 0; point1 < N; point1++)
            for (int point2 = 0; point2 < N; point2++) {

                if(point1 == point2)
                    continue;

                Point2D X = points.get(point1);
                Point2D Y = points.get(point2);

                if(distanceBetween(X, Y) < minDistance)
                    minDistance = distanceBetween(X, Y);

            }

        System.out.println("Min distance between two points: "  + minDistance);

    }

    private static double distanceBetween(Point2D point1, Point2D point2)
    {
        return point1.distanceTo(point2);
    }
}

