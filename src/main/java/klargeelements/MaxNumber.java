package klargeelements;

import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        int array[] = new int [] {98, 76, 45, 27, 15, 9, 89, 100};
        int max = getMaxElement(array);
        System.out.println(max);

            }

    static int getMaxElement(int[] element) {
        int max = element[0];

        for (int i = 0; i <= element.length - 1; i++) {
            if (element[i] > max) {
                max = element[i];
            }
        }
        return max;
    }


}






