package designpattern.builder;

public class CarChainingMethodDemo {
    public static void main(String[] args) {

        Car car1 = new Car.BuilderClass(Motor.ELECTRIC)
                .setBuilderAirConditioning(AirConditioning.MANUAL)
                .setBuilderAutomatPilot(true)
                .setBuilderNavigate(true)
                .builder();
        System.out.println(car1);





    }
}
