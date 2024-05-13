package Observer;

import java.util.Map;

public class Shopkeeper {

    String name;
    String address;
    Map<String,Integer> inventory;
    Registry registry = new Registry();

    public Shopkeeper(){
        this.name="Alpha";
        this.address="Delhi";
        inventory.put("Iphone",0);
    }

    public  boolean hasItem(String item){
        Integer value = inventory.get(item);
        if(value==null){ return false;}
        return value > 0;
    }

    public  void subscribe(String item,Customer customer){
        registry.subscribe(item,customer);
    }

}
