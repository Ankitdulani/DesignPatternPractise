package state;

public class FracturedState implements MyState{
    @Override
    public boolean canDance() {
        return false;
    }

    @Override
    public boolean canEat() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
