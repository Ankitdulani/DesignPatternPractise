package Momento;

public class Snapshot {

    private String name;
    private String data;

    public Snapshot() {}

    public Snapshot(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public void applyDelta(String dataDelta){
        data += dataDelta;
    }


    public Snapshot clone(){
        Snapshot newSnapshot = new Snapshot(this.name+"clone", data);
        return newSnapshot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getData() {
        return data;
    }
}
