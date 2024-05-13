package abstractFactory;

public class TataFactory {

    public static CarFactory  createCar(String type){
        switch (type){
            case "electric": return new ElectricCarFactory();
            case "petrol" : return new PetrolCarFactory();
        }
        return null;
    }
}
