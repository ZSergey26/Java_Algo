package Chapter_1_Fundamentals.BasicProgModel.Solutions;

import StdLibs.StdOut;

/**
 * Created by Владелец on 08.08.2015.
 */
public class Ex1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        System.out.println((char) ('a' + 2));
    }
}
