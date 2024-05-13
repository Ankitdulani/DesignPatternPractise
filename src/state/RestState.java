package state;

public class RestState implements MyState{
    @Override
    public boolean canDance() {
        return true;
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
