package klargeelements;

public class LargetsElements {
    public static void main(String[] args) {
        int i;
        int large[] = new int[3];
        int array[] = {140, 13, 25, 36, 40, 4, 76, 120, 7};
        int max = 0, index;

        for (int j = 0; j < 3; j++) {
            max = array[0];
            index = 0;
            for (i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    index = i;
                }
            }
            large[j] = max;
            array[index] = Integer.MIN_VALUE;

            System.out.println("Largest" + j + ":" + large[j]);

        }

    }
}

