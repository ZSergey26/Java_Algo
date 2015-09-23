package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

/**
 * Created by Sergei Zarochentsev on 23.09.2015.
 */
public class Ex1_3_14 {
    public static void main(String[] args) {
        MyArrayQueue<String> arrayQueue = new MyArrayQueue<>();

        arrayQueue.enqueue("one");
        arrayQueue.enqueue("two");
        arrayQueue.enqueue("three");

        System.out.println(arrayQueue);

        arrayQueue.dequeue();
        arrayQueue.dequeue();

        System.out.println(arrayQueue);

        arrayQueue.enqueue("four");
        arrayQueue.enqueue("five");

        System.out.println(arrayQueue);


        arrayQueue.enqueue("six");
        arrayQueue.enqueue("seven");
        System.out.println(arrayQueue);
    }
}
