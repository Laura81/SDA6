package klargeelements;

import java.sql.SQLOutput;

public class ElementRemover {

    public static void main(String[] args) {
        int[] array = new int[]{44, 222, 33, 123213, 412};
        int max = 123213;

        int[] newArray = removeElementFromArray(max, array);
        for (int value : newArray) {
            System.out.println(value);
        }
    }

      static int[] removeElementFromArray(int element, int[] oldArray) {
        int[] newArray = new int[oldArray.length - 1];
        int index = 0;

        for (int i = 0; i < oldArray.length; i++) {
            if (element != oldArray[i]) {
                newArray[index] = oldArray[i];
                index++;
            }
        }

        return newArray;
    }
}
