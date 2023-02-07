package Java_Basics.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power engine starts");
    }

    @Override
    public void stop() {
        System.out.println("power engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("power engine accelerate");
    }
}
