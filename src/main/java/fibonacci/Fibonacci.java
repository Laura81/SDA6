package fibonacci;

public class Fibonacci {

    public int getTerm (int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return getTerm(n- 1) + getTerm(n - 2);

    }
}
