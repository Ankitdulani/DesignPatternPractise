package chainOfResposibility;

public class AxisBankHandler extends BankHandler{

    public AxisBankHandler(BankHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(TransactionRequest request) {
        // handle if request is for Axis bank;
        super.handle(request);
    }
}
