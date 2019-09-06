package contbancar;

import org.junit.Test;

public class TestContBancar {

    @Test

    public void TestSum() {
//        ContBancar sum1 = new ContBancar(100);
//        sum1.afisareSum();
//        sum1.adaugaSum(200);
//        sum1.afisareSum();
//        sum1.extrageSum(35);
//        sum1.afisareSum();
//        sum1.getSum();
//        sum1.extrageSum(300);
//        sum1.afisareSum();
//        ContBancarExtins b = new ContBancarExtins(100000, 72, 5);
          ContBancar b=new ContBancarExtins(100000, 72, 10);
          b.afisareSum();
          b.printSum();




    }
}
