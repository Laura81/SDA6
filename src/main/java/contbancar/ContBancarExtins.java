package contbancar;

public class ContBancarExtins extends ContBancar {

    private int ratadobanziianuale;

    public ContBancarExtins(int sum, int n, int valdobanda) {
        super(sum);
        int N=365;
        afisareSum();
        System.out.println("ContBancarExtins");

        this.ratadobanziianuale=sum * valdobanda/100 * n/N;
        sum = sum + ratadobanziianuale;

        System.out.println(sum);
        setSum(sum);
        System.out.println(ratadobanziianuale);
    }
    public void printSum(){
        System.out.println("This is contbancarextins");
    }




}