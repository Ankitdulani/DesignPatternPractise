package chainOfResposibility;

public class HDFCBankHandler extends BankHandler{
    HDFCBankHandler(BankHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(TransactionRequest request) {
        // process transaction
        super.handle(request);
    }
}
