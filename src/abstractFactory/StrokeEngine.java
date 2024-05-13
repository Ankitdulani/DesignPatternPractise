package abstractFactory;

public class StrokeEngine implements Engine{
    @Override
    public int maxTorque() {
        return 5000;
    }
}
