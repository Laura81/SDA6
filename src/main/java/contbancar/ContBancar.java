package contbancar;

public class ContBancar {

    private int sum;

    public ContBancar() {
        System.out.println("ContBancar default");
    }

    public ContBancar(int sum) {
        System.out.println("ContBancar");
        this.sum = sum;
    }

    public int adaugaSum(int x) {
        sum = sum + x;
        return sum;
    }

    public boolean extrageSum(int x) {
        if (sum >= x) {
            sum = sum - x;
            System.out.println(sum);
            return true;
        } else {
            return false;
        }
    }

    public int getSum() {
        return sum;
    }

    public void afisareSum() {
        System.out.println("suma=" + sum);
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void printSum(){
        System.out.println("This is contbancar");
    }
}
