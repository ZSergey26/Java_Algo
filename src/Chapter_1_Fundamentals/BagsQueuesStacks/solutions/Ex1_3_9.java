package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sergei Zarochentsev on 07.09.2015.
 */
public class Ex1_3_9 {
    public static String completeBrackets(String testString) {
        ArrayList<String> list= new ArrayList<>();

        Scanner sc = new Scanner(testString);
        while(sc.hasNext())
        {
            String element = sc.next();
            list.add(element);
        }


        return ")))";
    }


    public static void main(String[] args) {
        System.out.println(completeBrackets("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )"));
    }
}
