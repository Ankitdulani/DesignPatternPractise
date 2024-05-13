package builder;


public class Computer {
    private String ram;
    private String processor;
    private String harddisk;
    private String keyboard;
    private String mouse;
    private String screen;


    public Computer(){}

    public Computer(String ram, String processor, String harddisk, String keyboard, String mouse, String screen) {
        this.ram=   ram;
        this.processor = processor;
        this.harddisk = harddisk;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.screen = screen;
    }

    public static class Builder{

        private Computer instance;

        public Builder(){
            instance = new Computer();
        }

        public Computer build(){
            return instance;
        }

        public Builder withRam(String ram){
            instance.ram = ram;
            return this;
        }
        public Builder withProcessor(String processor){
            instance.processor = processor;
            return this;
        }

    }
}

