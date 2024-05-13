package chainOfResposibility;

public abstract class BankHandler {

    BankHandler nextHandler;

    BankHandler(BankHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

     public void handle(TransactionRequest request){
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
