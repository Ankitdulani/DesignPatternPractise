package state;

public class EatingState implements MyState{
    @Override
    public boolean canDance() {
        return false;
    }

    @Override
    public boolean canEat() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
