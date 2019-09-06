package prime;

public class IsPrime {

    public boolean isPrimeNumber(int n) {

        if (n <= 1)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] arrayPrimeNumber(int[] a) {
        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (isPrimeNumber(a[i])) {
                System.out.println(a[i]);
            }
        }
        return newArray;
    }
}




