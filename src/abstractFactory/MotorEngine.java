package abstractFactory;

public class MotorEngine implements Engine{
    @Override
    public int maxTorque() {
        return 1200;
    }
}
