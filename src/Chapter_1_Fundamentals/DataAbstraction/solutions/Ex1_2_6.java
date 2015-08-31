package Chapter_1_Fundamentals.DataAbstraction.solutions;

/**
 * Created by Sergei Zarochentsev on 28.08.2015.
 */
public class Ex1_2_6 {
    public static void main(String[] args) {
        String str1 = "TGACGAC";
        String str2 = "ACTGACG";

        if(isCyclicString(str1, str2)) {
            System.out.println("Strings is cyclic");
        }
        else {
            System.out.println("Strings not cyclic");
        }

    }

    public static boolean isCyclicString(String str1, String str2)
    {
        int shift = str2.indexOf( str1.charAt(0) );
        for (int i = 1; i < str1.length(); i++) {
            Character sym = str1.charAt(i);
            Character sym2 = str2.charAt( (i + shift) % str1.length() );
            if(sym != sym2)
                return false;
        }
        return true;
    }
}
