package PracticeOOPS;

public class CarUsage {
    public static void main(String[] args) {
        Car newCar = new Car("Toyota","E134R",2002);
        newCar.startEngine();
        newCar.accelerating(20);
        newCar.stopEngine();
    }
}
