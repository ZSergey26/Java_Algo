package Chapter_1_Fundamentals.BagsQueuesStacks;

import java.util.Arrays;

/**
 * Created by Sergei Zarochentsev on 28.08.2015.
 */
public class FixedCapacityStackOfStrings<Item> {
    private Item[] array;
    private int stack_head;

    @SuppressWarnings("unchecked")
    public FixedCapacityStackOfStrings(int capacity) {
        array = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return stack_head == 0;
    }

    public int size() {
        return stack_head;
    }

    public void push(Item element) {
        array[ stack_head++ ] = element;
    }

    public Item pop() {
        return  array[ --stack_head];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings<String> myStack = new FixedCapacityStackOfStrings<>(10);
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
    }

}
