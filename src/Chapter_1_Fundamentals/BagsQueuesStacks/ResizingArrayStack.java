package Chapter_1_Fundamentals.BagsQueuesStacks;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Sergei Zarochentsev on 28.08.2015.
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] array;
    private int stack_head;

    @SuppressWarnings("unchecked")
    public ResizingArrayStack(int capacity) {
        array = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return stack_head == 0;
    }

    public int size() {
        return stack_head;
    }

    public void push(Item element) {
        if(stack_head == array.length)
            resize(2 * array.length);

        array[ stack_head++ ] = element;
    }

    public Item pop() {
        Item item = array[ --stack_head];

        array[stack_head] = null;
        if(stack_head >0 && stack_head == array.length/4);
            resize(array.length / 2);

        return item;
    }



    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < stack_head; i++) {
            temp[i] = array[i];

        array = temp;
        }

    }

    public static void main(String[] args) {
        ResizingArrayStack<String> myStack = new ResizingArrayStack<>(10);
        myStack.push("top");
        myStack.push("kek");
        myStack.push("matb");
        myStack.push("pot");

        System.out.println(myStack);
        System.out.println(myStack.size());

        System.out.println("Pop: " + myStack.pop());
        myStack.pop();
        myStack.pop();
        myStack.pop();

        if(myStack.isEmpty())
            System.out.println("Stack is empty now");
        else
            System.out.println("Stack not empty");

        ResizingArrayStack<Integer> myStack2 = new ResizingArrayStack<>(10);
        for (int i = 0; i < 10; i++) {
            myStack2.push(i);
        }

        for (Integer integer : myStack2) {
            System.out.println(integer);
        }

    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = stack_head;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return array[--i];
        }
    }
}
