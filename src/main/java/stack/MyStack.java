package stack;

import java.util.Arrays;

public class MyStack {//Class Definition

    private int top;
    private int[] elements;
    private int size;

    public MyStack(int size) { // Constructor definition
        this.top = -1;
        this.elements = new int[size];
        this.size = size;
        //field initialization
    }

    public MyStack(MyStack oldStack) {
        int oldSize = oldStack.size;
        this.size = oldSize + oldSize / 2;
        this.elements = new int[size];
        for (int i = 0; i < oldSize; i++) {
            this.elements[i] = oldStack.elements[i];
        }
        this.top = oldSize - 1;
    }

    @Override
    public String toString() {
        //toString method will display the return value
        return "MyStack{" +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    public void push(int z) {
        // if (top+1==size){
        // System.out.println("Stack is full");
        // return;
        // }
        elements[top + 1] = z;
        top++;
    }

    public int pop() {
        //if (top<0){
        // System.out.println("Stack is empty!");
        // int invalidValue=-1;
        // return invalidValue;
        // }
        int elementToBeRemoved = elements[top];
        elements[top] = 0;
        top--;
        return elements[top];
    }

    public int peek() {
        return elements[top];
    }
}
