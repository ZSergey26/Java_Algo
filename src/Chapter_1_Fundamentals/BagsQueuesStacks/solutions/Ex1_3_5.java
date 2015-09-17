package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import java.util.Stack;

/**
 * Created by Sergei Zarochentsev on 02.09.2015.
 */
public class Ex1_3_5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int N = 6;


        while( N > 0 )
        {
            stack.push(N % 2);
            N = N / 2;
        }

        for (Integer d : stack) {
            System.out.print(d);
        }
        System.out.println();
    }
}
