package Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registry {

    private Map<String, List<Customer>> subscribersMap = new HashMap<>();

    public Registry() {}

    public void subscribe(String item, Customer customer) {
        List<Customer> subscribers = subscribersMap.get(item);
        if (subscribers == null) { subscribers = new ArrayList<>();}
        subscribers.add(customer);
        subscribersMap.put(item, subscribers);
    }

    public void unsubscribe(String item, Customer customer) {
        List<Customer> subscribers = subscribersMap.get(item);
        if (subscribers != null) {
            subscribers.remove(customer);
            subscribersMap.put(item, subscribers);
        }
    }

    public void notify(String item, Shopkeeper shopkeeper, String message) {
        List<Customer> customerList =  subscribersMap.get(item);
        customerList.stream().forEach( customer -> { customer.receiveMessage(shopkeeper,message);});
    }

}
