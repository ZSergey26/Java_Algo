package Chapter_2_Sorting.MergeSort;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by Sergei Zarochentsev on 28.09.2015.
 */
public class kek1 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static boolean isPalindrome(String text) {
        String text1 = text.replaceAll("\\W", "");
        text1 = text1.toLowerCase();

        for(int i = 0; i < text1.length() / 2; i++) {
            if(text1.charAt(i) != text1.charAt(text1.length() - 1 - i))
                return false;
        }
        return true; // your implementation here
    }

    public static BigInteger factorial(int value) {
        if(value == 0)
            return BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 2; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, arr, 0, a1.length);

        int counter = a1.length;
        for (int anA2 : a2) {
            arr[counter++] = anA2;
        }

        Arrays.sort(arr);
        return arr; // your implementation here
    }
}
