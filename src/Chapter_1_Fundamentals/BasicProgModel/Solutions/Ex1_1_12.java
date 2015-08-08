package Chapter_1_Fundamentals.BasicProgModel.Solutions;

/**
 * Created by Владелец on 08.08.2015.
 */
public class Ex1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for(int i = 0; i < 10; i++)
            a[i] = 9 - i;

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
