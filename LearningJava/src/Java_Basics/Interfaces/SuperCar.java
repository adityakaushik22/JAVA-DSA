package Java_Basics.Interfaces;



public class SuperCar {
    private Engine engine;
    private Media media = new CDplayer();

    public SuperCar() {
        engine = new PowerEngine();
    }

    public SuperCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
