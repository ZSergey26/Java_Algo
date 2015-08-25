package Chapter_1_Fundamentals.DataAbstraction;

/**
 * Created by Sergei Zarochentsev on 11.08.2015.
 */
public class StrPalindrome {

    private static String test2;

    public static void main(String[] args) {
        String test1 = "abba";
        test2 = "kek";
        String test3 = "java algo";
        String test4 = "java";


        System.out.println(isStringPalindrome(test1));
        System.out.println(isStringPalindrome(test2));
        System.out.println(isStringPalindrome(test3));
        System.out.println(isStringPalindrome(test4));
    }

    public static boolean isStringPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            int index = string.length() - 1 - i;
            if (string.charAt(i) != string.charAt(index))
                return false;
        }
        return true;
    }
}

