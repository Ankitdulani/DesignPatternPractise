package abstractFactory;

public class JKTyre implements Tyre{
    @Override
    public String getTubeType() {
        return "non tube";
    }

    @Override
    public String getGripType() {
        return "A grip";
    }

    @Override
    public Integer getRadius() {
        return .75;
    }
}
