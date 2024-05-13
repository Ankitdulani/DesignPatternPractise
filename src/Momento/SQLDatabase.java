package Momento;

public class SQLDatabase {
    String data;
    String delta;


    public void addEntry(String updateData){
        this.data += updateData;
        this.delta += updateData;

    }

    public void setData(String date) {
        this.data = date;
    }

    public Snapshot createSnapshot(String name) {
        delta = "";
        return new Snapshot(name, data);
    }

    public String getDelta() {
        return delta;
    }
}
