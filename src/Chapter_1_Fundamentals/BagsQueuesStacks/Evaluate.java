package Chapter_1_Fundamentals.BagsQueuesStacks;

import java.util.*;

/**
 * Created by Sergei Zarochentsev on 28.08.2015.
 */
public class Evaluate {
    public static void main(String[] args) {
        String expression = "( ( 2 + 3 ) + sqrt ( 4 ) )";
        System.out.println( expression );
        System.out.println( DijkstraTwoStackAlg( expression ) );
    }

    public static Double DijkstraTwoStackAlg(String expression)
    {
        List<String> operationStack = new ArrayList<>();
        List<Double> valuesStack = new ArrayList<>();

        Set<String> operationsSet = new HashSet<>();
        operationsSet.add("+");
        operationsSet.add("-");
        operationsSet.add("/");
        operationsSet.add("*");
        operationsSet.add("sqrt");

        Scanner scanner = new Scanner(expression);

        while(scanner.hasNext())
        {
            String currElement = scanner.next();

            if( currElement.equals( "(" ) )
                continue;


            if( operationsSet.contains( currElement ) )
                operationStack.add(currElement);
            else
                if( currElement.equals( ")" ) )
                {
                    String operation = operationStack.remove( operationStack.size() - 1 );
                    double value = valuesStack.remove( valuesStack.size() - 1 );
                    switch (operation) {
                        case "+" : value = valuesStack.remove( valuesStack.size() - 1 ) + value;
                            break;

                        case "-" : value = valuesStack.remove( valuesStack.size() - 1 ) - value;
                            break;

                        case "/" : value = valuesStack.remove( valuesStack.size() - 1 ) / value;
                            break;

                        case "*" : value = valuesStack.remove( valuesStack.size() - 1 ) * value;
                            break;

                        case "sqrt" : value = Math.sqrt(value);
                            break;
                    }

                    valuesStack.add(value);
                }
                else
                {
                    valuesStack.add( Double.parseDouble(currElement) );
                }


        }


        return valuesStack.remove( valuesStack.size() - 1 );
    }
}
