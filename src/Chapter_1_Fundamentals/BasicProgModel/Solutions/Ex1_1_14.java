package Chapter_1_Fundamentals.BasicProgModel.Solutions;

/**
 * Created by Sergei Zarochentsev on 08.08.2015.
 */
public class Ex1_1_14 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double x = lg1(500);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        System.out.println("Result = " + x);
    }

    public static double lg(double x)
    {
        int log = 0;
        double num = x;
        while(x / 10.0 >= 1) {
            log++;
            x /= 10;
        }
        return log;
    }

    public static double lg1(double x)
    {
        double log = fastLg(x);
        double step = 0.0001;


        while(Math.pow(10,log) < x )
        {
            log+=step;
        }

        Math.log10(100);
        return log;
    }

    public static int fastLg(double x)
    {
        if(x > 0 && x < 10)
            return 0;
        if(x > 10 && x < 100)
            return 1;
        if(x > 100 && x < 1000)
            return 2;
        if(x > 1000 & x < 10000)
            return 3;
        if(x > 10000 & x < 100000)
            return 4;
        if(x > 100000 & x < 10000000)
            return 5;
        return -1;
    }


}
