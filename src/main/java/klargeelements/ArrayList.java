package klargeelements;

public class ArrayList {
    public static void main(String[] args) {
        int array[] = new int[]{3, 65, 7, 89, 1, 13, 2};
        numberList(array);
        listNumber(array);
        oddInteger(array);
        divideInteger(array);
        sumInteger(array);
        sumFourNumber(array);
        sumLastFive(array);
        sumUnderTen(array);
    }

    public static void numberList(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void listNumber(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void oddInteger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void divideInteger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    static void sumInteger(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.print(sum);
        System.out.println();
    }

    static void sumFourNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + array[i];
        }
        System.out.print(sum);
        System.out.println();
    }

    static void sumLastFive(int[] array) {
        int sum = 0;
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 2) {
                counter++;
                sum += array[i];
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.print(sum);
        System.out.println();
    }

    static void sumUnderTen(int[] array) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum += array[i];
            if (sum >= 10) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}

















