package chainOfResposibility;

public class Main {
    public static void main(String[] args) {


        BankHandler axisBankHandler = new AxisBankHandler(null);
        BankHandler hdfcBankHandler = new HDFCBankHandler(axisBankHandler);
        TransactionRequest request = new TransactionRequest();
        axisBankHandler.handle(request);
        hdfcBankHandler.handle(request);

    }
}
