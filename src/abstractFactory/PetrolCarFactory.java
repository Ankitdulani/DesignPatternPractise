package abstractFactory;

public class PetrolCarFactory implements CarFactory{
    @Override
    public Tyre createTyre() {
        return new JKTyre();
    }

    @Override
    public Engine createEngine() {
        return new StrokeEngine();
    }
}
