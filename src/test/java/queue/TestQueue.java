package queue;

import org.junit.Test;

public class TestQueue {

    @Test

    public void TestQueue() throws Exception {

        Queue q1 = new Queue(5);
        System.out.println(q1);

        q1.enQueue(5);
        System.out.println(q1);
        q1.enQueue(7);
        System.out.println(q1);
        q1.enQueue(9);
        System.out.println(q1);
        q1.enQueue(3);
        System.out.println(q1);
        q1.enQueue(8);
        System.out.println(q1);
        q1.enQueue(6);
        System.out.println(q1);

        int element = q1.deQueue();
        System.out.println(element);
        System.out.println(q1);
        q1.deQueue();
        System.out.println(q1);
        q1.deQueue();
        System.out.println(q1);
        q1.deQueue();
        System.out.println(q1);
        q1.enQueue(5);
        System.out.println(q1);
        q1.enQueue(7);
        System.out.println(q1);
        q1.deQueue();
        System.out.println(q1);
        q1.deQueue();
        System.out.println(q1);
        q1.enQueue(8);
        System.out.println(q1);
        q1.deQueue();
        System.out.println(q1);

        q1.getFront();
        System.out.println(q1.getFront());
        System.out.println(q1.getFront());
    }
}
