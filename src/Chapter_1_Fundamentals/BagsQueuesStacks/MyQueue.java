package Chapter_1_Fundamentals.BagsQueuesStacks;

import java.util.Iterator;

/**
 * Created by Sergei Zarochentsev on 01.09.2015.
 */
public class MyQueue<Item>  implements Iterable<Item>  {

    @Override
    public Iterator<Item> iterator() {
        return new  QueueIterator();
    }

    private Node first;
    private Node last;
    private int N;


    private class Node
    {
        Item item;
        Node next;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty())
            first = last;
        else
            oldlast.next = last;

        N++;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;

        if(isEmpty())
            last = null;

        N--;
        return item;
    }

    private class QueueIterator implements Iterator<Item> {
        private Node iter = first;
        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public Item next() {
            Item item = iter.item;
            iter = iter.next;
            return item;
        }
    }

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("One");
        queue.enqueue("Two");
        queue.enqueue("Three");

        System.out.println();
        for (String s : queue) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < queue.size() -1; i++) {
            queue.enqueue(queue.dequeue());
        }



        System.out.println();
        for (String s : queue) {
            System.out.print(s + " ");
        }
    }
}
