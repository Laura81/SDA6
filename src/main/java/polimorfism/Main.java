package polimorfism;

public class Main {

    public static void main(String[] args) {

        Animals caine = new Dog();
        Animals pisica = new Cat();
        Animals soricel = new Mouse();
        Animals pestisor = new Fish();

        Animals[] pets = {caine, pisica, soricel, pestisor};

        for (Animals y : pets) {
            y.walk();
            y.swim();
        }
    }
}


