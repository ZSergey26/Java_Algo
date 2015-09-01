package Chapter_1_Fundamentals.BagsQueuesStacks;

import java.util.Iterator;

/**
 * Created by Sergei Zarochentsev on 31.08.2015.
 */
public class ListStack<Item> implements Iterable<Item> {

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

    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
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

    public void revert()
    {

    }


    public static void main(String[] args) {
        ListStack<String> listStack = new ListStack<>();

        listStack.push("to");
        listStack.push("be");
        listStack.push("or");
        listStack.push("not");

        System.out.print("List: ");
        for (String s : listStack) {
            System.out.print(s + " <- ");
        }

        ListStack<String> reverseListStack = new ListStack<>();
        for (String s : listStack) {
            reverseListStack.push(listStack.pop());
        }

        System.out.println();
        System.out.print("List: ");
        for (String s : reverseListStack) {
            System.out.print(s + " <- ");
        }
    }

}
