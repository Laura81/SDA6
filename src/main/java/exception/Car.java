package exception;

public class Car {
    private int speed;

    public void increaseSpeed() throws CarCrashedException {
        speed += 70;
        if (speed > 200) {
            throw new CarCrashedException("Car crashed!");
        }
    }

    public static void main(String[] args) {
        Car c=new Car();
        try{
            c.increaseSpeed();
            c.increaseSpeed();
            c.increaseSpeed();
            c.increaseSpeed();
        } catch (CarCrashedException e){
            e.printStackTrace();
        }
    }

}
