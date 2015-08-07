package Chapter1;

/**
 * Наибольший общий делитель
 * Алгоритм Евклида
 * Для чисел 70 и 105 НОД будет 35
 */
public class GCD {

    public static int GCD( int m, int n )
    {
        if(n == 0)
            return m;

        int r = m % n;

        return GCD( n, r );
    }

    public static void main(String[] args) {
        System.out.println( GCD(70, 105) );
    }
}

class Tuple
{
    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public Tuple(int first, int second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "[" + first +  ", " + second + "]";
    }

    public void swap1()
    {

        first  = first + second;
        second = first - second;
        first  = first - second;
    }

    public void swap2()
    {

        first  = first ^ second;
        second = first ^ second;
        first  = first ^ second;
    }
}