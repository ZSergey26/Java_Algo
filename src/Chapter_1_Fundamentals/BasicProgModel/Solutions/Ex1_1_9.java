package Chapter_1_Fundamentals.BasicProgModel.Solutions;

/**
 */
public class Ex1_1_9 {
    public static void main(String[] args) {
        System.out.println(toBinStr(0));
    }

    private static String toBinStr(int N)
    {
        String result = "";

        if(N == 0)
            return "0";

        for(int n = N; n > 0; n /=2)
            result = (n % 2) + result;

        return result;
    }
}
