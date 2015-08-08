package Chapter_1_Fundamentals.BasicProgModel.Solutions;

import StdLibs.StdOut;

/**
 * Created by Владелец on 08.08.2015.
 */
public class Ex1_1_7 {
    public static void main(String[] args) {
        func1();
        func2();
    }

    private static void func1()
    {
        double t = 9.0;
        while(Math.abs(t-9.0/t)> 0.001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n",t);
    }

    private static void func2()
    {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }
}
