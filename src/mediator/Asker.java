package mediator;

public class Asker {

    private Zerodha mediator;

    public void ask(){
        mediator.inform(this,new ShareBid("Reliance",10,2000));
    }
}
