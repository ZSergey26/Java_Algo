package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import java.util.Arrays;

/**
 * Created by Sergei Zarochentsev on 23.09.2015.
 */
public class MyArrayQueue<T> {

    T[] array;

    private int first;
    private int last;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayQueue() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T item) {
        size++;
        array[last++] = item;
    }

    public int size() {
        return size;
    }

    public T dequeue() {
        size--;
        T item = array[first];
        array[first] = null;
        first++;
        return item;

    }

    @Override
    public String toString() {
        return "MyArrayQueue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
