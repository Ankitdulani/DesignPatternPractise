package builder;

public class Main {

    public static void main(String[] args) {

        Computer.Builder builder = new Computer.Builder();
        Computer myComputer = builder.withRam("8GB").withProcessor("Intel").build();
    }
    
}
