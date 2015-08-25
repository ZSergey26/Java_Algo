package Chapter_1_Fundamentals.DataAbstraction.solutions;

/**
 * Created by Sergei Zarochentsev on 25.08.2015.
 */
public class Ex1_2_3 {

    private static final int DEFAULT_N = 10;

    public static void main(String[] args) {
        int N;
        if(args.length == 0)
            N = DEFAULT_N;
        else
            N = Integer.parseInt(args[0]);
    }
}
