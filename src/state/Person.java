package state;

public class Person {
    private String name;
    private MyState state;

    public Person(String name) {
        this.name = name;
        state = new RestState();
    }

    public void dance(){
        if(!state.canDance()) return ;
        //
    }

    public void walk(){
        if(!state.canWalk()) return;

    }

    public void eat(){
        if(!state.canEat()) return;

    }

    public void changeState(MyState state){
        this.state = state;
    }

}
