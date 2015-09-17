package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import Chapter_1_Fundamentals.BagsQueuesStacks.ListStack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Sergei Zarochentsev on 02.09.2015.
 */
public class Ex1_3_4 {
    public static void main(String[] args) {
        System.out.println(checkBrackets("{[())}"));
    }

    public static boolean checkBrackets(String string) {
        boolean result;


        ListStack<String> stack = new ListStack<>();

        Scanner sc = new Scanner(string);
        while(sc.hasNext())
        {
            String element = sc.next();

            if (!brackets.contains(element))
                continue;
            else if (openBrackets.contains(element))
                stack.push(element);
            else if (closeBrackets.contains(element)) {

                if(stack.isEmpty())
                    return false;

                if(element.equals(")") && stack.peek().equals("("))
                    stack.pop();
                else if(element.equals("]") && stack.peek().equals("["))
                    stack.pop();
                else if(element.equals("}") && stack.peek().equals("{"))
                    stack.pop();

            }
        }

        return stack.isEmpty();
    }

    static private Set<String> brackets;
    static private Set<String> openBrackets;
    static private Set<String> closeBrackets;

    static
    {
        brackets = new HashSet<>();
        openBrackets = new HashSet<>();
        closeBrackets = new HashSet<>();

        brackets.add("(");
        brackets.add(")");

        brackets.add("[");
        brackets.add("]");

        brackets.add("{");
        brackets.add("}");

        openBrackets.add("(");
        openBrackets.add("[");
        openBrackets.add("{");

        closeBrackets.add(")");
        closeBrackets.add("]");
        closeBrackets.add("}");
    }


}
