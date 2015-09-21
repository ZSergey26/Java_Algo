package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Sergei Zarochentsev on 21.09.2015.
 */
public class Ex1_3_11 {
    public static void main(String[] args) {

    }

    private static Set<String> operations;
    static {
        operations = new HashSet<>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");
    }
    public static double calcPostfix(String postfixExpression) {
        Stack<Double> values = new Stack<>();
        for (StringTokenizer stringTokenizer = new StringTokenizer(postfixExpression); stringTokenizer.hasMoreTokens(); ) {
            String s = stringTokenizer.nextToken();

            if (operations.contains(s)) {

                double val2 = values.pop();
                double val1 = values.pop();

                switch (s) {
                    case "+" : values.push(val1 + val2);
                        break;

                    case "-" : values.push(val1 - val2);
                        break;

                    case "*" : values.push(val1 * val2);
                        break;

                    case "/" : values.push(val1 / val2);
                        break;
                }

            } else {
                values.push(Double.valueOf(s));
            }

        }

        return values.pop();
    }

}
