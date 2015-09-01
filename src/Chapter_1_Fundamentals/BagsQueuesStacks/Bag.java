package Chapter_1_Fundamentals.BagsQueuesStacks;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

    @Override
    public Iterator<Item> iterator() {
        return new  ListStackIterator();
    }

    private Node first;
    private class Node
    {
        Item item;
        Node next;
    }

    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void add(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }


    private class ListStackIterator implements Iterator<Item> {
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

    }

}