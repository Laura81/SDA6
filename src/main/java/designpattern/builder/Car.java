package designpattern.builder;

public class Car {

    private Motor motor;
    private String color;
    private AirConditioning airConditioning;
    private boolean automatPilot;
    private boolean navigate;

    private Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "motor=" + motor +
                ", color='" + color + '\'' +
                ", airConditioning=" + airConditioning +
                ", automatPilot=" + automatPilot +
                ", navigate=" + navigate +
                '}';
    }

    public static class BuilderClass {
        private Motor builderMotor;
        private String builderColor = "Silver";
        private AirConditioning builderAirConditioning;
        private boolean builderAutomatPilot;
        private boolean builderNavigate;

        public BuilderClass(Motor builderMotor) {
            this.builderMotor = builderMotor;
        }

        public BuilderClass setBuilderColor(String builderColor) {
            this.builderColor = builderColor;
            return this;
        }

        public BuilderClass setBuilderAirConditioning(AirConditioning builderAirConditioning) {
            this.builderAirConditioning = builderAirConditioning;
            return this;
        }

        public BuilderClass setBuilderAutomatPilot(boolean builderAutomatPilot) {
            this.builderAutomatPilot = builderAutomatPilot;
            return this;
        }

        public BuilderClass setBuilderNavigate(boolean builderNavigate) {
            this.builderNavigate = builderNavigate;
            return this;
        }

        public Car builder() {
            Car car = new Car();
            car.airConditioning = this.builderAirConditioning;
            car.automatPilot = this.builderAutomatPilot;
            car.color = this.builderColor;
            car.motor = this.builderMotor;
            car.navigate = this.builderNavigate;
            return car;
        }
    }
}
