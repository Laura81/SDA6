package shuffledeckcard;

public class Card {

    CardForm suite;
    CardNumber number;

    public Card(CardForm suite, CardNumber number) {
        this.suite = suite;
        this.number = number;
    }

    public CardForm getSuite() {
        return suite;
    }

    public CardNumber getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suite=" + suite +
                ", number=" + number +
                "}\n";
    }
}
