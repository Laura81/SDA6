package shuffledeckcard;

import java.util.Arrays;

public class Deck {

    Card[] carti;


    public Deck() {
        this.carti = new Card[52];
    }

    void fill() {
        CardForm[] values = CardForm.values();
        CardNumber[] number = CardNumber.values();
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < number.length; j++) {
                Card carte1 = new Card(values[i], number[j]);
                carti[index] = carte1;
                index++;
            }
        }
    }

    void print() {
        System.out.println(Arrays.toString(carti));
    }
}
