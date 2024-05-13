package abstractFactory;

public class ElectricCarFactory implements CarFactory{
    @Override
    public Tyre createTyre() {
        return new JKTyre();
    }

    @Override
    public Engine createEngine() {
        return new MotorEngine();
    }
}
