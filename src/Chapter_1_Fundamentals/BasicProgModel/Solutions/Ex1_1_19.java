package Chapter_1_Fundamentals.BasicProgModel.Solutions;

/**
 * Created by Sergei Zarochentsev on 09.08.2015.
 */
public class Ex1_1_19 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double x = Fib(10);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        System.out.println("Result = " + x);
    }

    public static long RecursionFibonacci(int N)
    {
        if(N == 0)
            return 0;

        if(N == 1)
            return 1;

        return RecursionFibonacci(N - 1) + RecursionFibonacci(N - 2);
    }

    public static long Fib(int N)
    {
        long[] array = new long[N + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < N + 1; i++) {
            array[i] = array[i - 2]  + array[i - 1];
        }

        return array[N];
    }
}
