package Java_Basics.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.start();
//        car.stop();
//        car.accelerate();

        SuperCar car = new SuperCar();
        car.start();
        car.startMusic();

        Engine ElectricEngine = new ElectricEngine();
        SuperCar car1 = new SuperCar(ElectricEngine);
        car1.start();
    }
}
