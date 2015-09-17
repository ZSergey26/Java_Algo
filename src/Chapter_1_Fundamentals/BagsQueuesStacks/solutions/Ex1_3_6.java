package Chapter_1_Fundamentals.BagsQueuesStacks.solutions;

import Chapter_1_Fundamentals.BagsQueuesStacks.ListStack;
import Chapter_1_Fundamentals.BagsQueuesStacks.MyQueue;

/**
 * Created by Sergei Zarochentsev on 02.09.2015.
 */
public class Ex1_3_6 {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("One");
        queue.enqueue("Two");
        queue.enqueue("Three");
        queue.enqueue("Four");

        ListStack<String> stack = new ListStack<>();

        while(!queue.isEmpty())
            stack.push(queue.dequeue());
        while(!stack.isEmpty())
            queue.enqueue(stack.pop());

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
