package queue;

import java.util.Arrays;

public class Queue {

    private int[] elements;
    private int head;
    private int tail;
    private int size;
    private int maxSize;

    public Queue(int maxSize) {
        head = 0;
        tail = 0;
        this.elements = new int[maxSize];
        this.maxSize = maxSize;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "elements=" + Arrays.toString(elements) +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    public boolean enQueue(int element) {
        if (size == maxSize) {
            return false;
        }
        elements[tail] = element;
        tail++;
        tail = tail % maxSize;
        size++;
        return true;
    }

    public int deQueue() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty");
        }
        int element = elements[head];
        elements[head] = 0;
        head++;
        head = head % maxSize;
        size--;
        return element;
    }

    public int getFront() {

        return elements[head];
    }
}

