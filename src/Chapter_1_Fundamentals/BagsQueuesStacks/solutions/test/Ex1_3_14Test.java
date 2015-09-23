package Chapter_1_Fundamentals.BagsQueuesStacks.solutions.test;

import Chapter_1_Fundamentals.BagsQueuesStacks.solutions.MyArrayQueue;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Sergei Zarochentsev on 23.09.2015.
 */
public class Ex1_3_14Test {



    @Test
    public void testQueue() throws Exception {
        MyArrayQueue<String> arrayQueue = new MyArrayQueue<>();

        assertTrue(arrayQueue.isEmpty());

        arrayQueue.enqueue("one");
        arrayQueue.enqueue("two");
        arrayQueue.enqueue("three");

        assertEquals(arrayQueue.size(), 3);

        assertEquals(arrayQueue.dequeue(), "one");

        assertEquals(arrayQueue.size(), 2);


    }
}