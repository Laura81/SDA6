package designpattern.structuraldecorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
      //  ChristmasTree christmasTree1 = new ChristmasTreeImpl();
        String mesaj = new Topper(new SilverBall(new RedLights(new ChristmasTreeImpl()))).decorate();
        System.out.println(mesaj);

        String mesaj2 = new SilverBall(new ChristmasTreeImpl()).decorate();
        System.out.println(mesaj2);
    }
}
