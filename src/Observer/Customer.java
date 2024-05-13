package Observer;

public class Customer {
    String name;
    String emailAddress;

    public void receiveMessage(Shopkeeper shopkeeper, String message) {
        System.out.println(message);
    }
}
