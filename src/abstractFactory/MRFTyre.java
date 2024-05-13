package abstractFactory;

public class MRFTyre implements Tyre{
    @Override
    public String getTubeType() {
        return "tubeless";
    }

    @Override
    public String getGripType() {
        return "z grip";
    }

    @Override
    public Integer getRadius() {
        return 1;
    }
}
