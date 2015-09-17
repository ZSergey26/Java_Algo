package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import java.util.*;

/**
 * Created by Sergei Zarochentsev on 17.09.2015.
 */
public class Ex1_3_10 {
    public static void main(String[] args) {
        toPostfix("( 1 + 2 ) * 4 + 3");
    }

    public static String toPostfix(String exprsession) {
        Map<String, Integer> operationsAndPriority = new HashMap<>();

        operationsAndPriority.put("(", 0);
        operationsAndPriority.put(")", 0);
        operationsAndPriority.put("-", 1);
        operationsAndPriority.put("+", 1);
        operationsAndPriority.put("*", 2);
        operationsAndPriority.put("/", 2);

        Set<String> operationSet =  operationsAndPriority.keySet();

        Stack<String> operationStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();

        for (StringTokenizer stringTokenizer = new StringTokenizer(exprsession); stringTokenizer.hasMoreTokens(); ) {
            String s = stringTokenizer.nextToken();

            if (s.equals("(")) {
                operationStack.push(s);
                continue;
            }
            if(s.equals(")"))
            {
                while(!operationStack.peek().equals("("))
                {
                    resultStack.push(operationStack.pop());
                }
                operationStack.pop();
                continue;
            }


            if(operationSet.contains(s))
            {
                if (!operationStack.isEmpty()) {
                    String topStackOperation = operationStack.peek();



                    if (operationsAndPriority.get(s) <= operationsAndPriority.get(topStackOperation))
                    {
                        resultStack.push(operationStack.pop());
                    }
                    operationStack.push(s);
                }
                else
                {
                    operationStack.push(s);
                }
            }
            else
            {
                resultStack.push(s);
            }
        }

        int x = 15488;
        while(!operationStack.isEmpty())
        {
            resultStack.push(operationStack.pop());
        }

        StringBuffer result = new StringBuffer();
        for (String s : resultStack) {
            result.append(s).append(" ");
        }

        return result.toString().trim();
    }
}
