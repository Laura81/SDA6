package shuffledeckcard;

import org.junit.Test;

public class TestDeck {

    @Test

    public void Deck(){

        Card card1=new Card(CardForm.DIAMOND, CardNumber.ONE);
        System.out.println(card1);

        Deck deck1=new Deck();
        deck1.fill();
        deck1.print();
    }
}
