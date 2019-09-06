package stack;

import org.junit.Assert;
import org.junit.Test;

public class TestMyStack {

    @Test
    public void TestToString() {

        MyStack s1 = new MyStack(5);
        System.out.println(s1);
    }

    @Test
    public void TestPush() {
       /* MyStack s1 = new MyStack(5);
        s1.push(5);
        System.out.println(s1);
        s1.push(7);
        System.out.println(s1);
        s1.push(8);
        System.out.println(s1);
        s1.push(10);
        System.out.println(s1);
        s1.push(4);
        System.out.println(s1);
        s1.push(15);
        System.out.println(s1);

        System.out.println(s1.pop());
        System.out.println(s1);
    }*/
        MyStack stack = new MyStack(4);// constructor call
        stack.push(5); // push method call with parameter (5)
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        int actual = stack.pop();//assign an expected value
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestPeek() {
        MyStack stack = new MyStack(4);
        stack.push(5);
        // int actual=stack.peek();
        // int expected = 5;
        // Assert.assertEquals(expected, actual);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        System.out.println(stack);
        try {
            stack.push(9);
        } catch (ArrayIndexOutOfBoundsException e) {
            stack = new MyStack(stack);
            stack.push(9);
            System.out.println(stack);
        }
        //int actual=stack.getElements();
        // int [] expected={5,9,9,9,9,0};
        //Assert.assertArrayEquals(expected, actual);

    }
}
