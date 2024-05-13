package Momento;

import java.util.HashMap;
import java.util.Map;

public class BackUpService {
    SQLDatabase sqlDatabase = new SQLDatabase();
    private String lastSnapshotName=null;

    Integer count =0;
    Map<String, Snapshot> backups = new HashMap<>();

    public void doBackUp(){

        if(lastSnapshotName ==  null){
            Snapshot snapshot = sqlDatabase.createSnapshot(String.format("Snapshot:%s",count++));
            backups.put(snapshot.getName(),snapshot);
            lastSnapshotName = snapshot.getName();
        }else{
            Snapshot lastSnapshot  = backups.get(lastSnapshotName);
            Snapshot cloneSnapshot = lastSnapshot.clone();
            cloneSnapshot.applyDelta(sqlDatabase.getDelta());
            cloneSnapshot.setName(String.format("Snapshot:%s",count++));
            backups.put(cloneSnapshot.getName(),cloneSnapshot);
            lastSnapshotName = cloneSnapshot.getName();
        }
    }

    public void restoreDB(){
        Snapshot snapshot = backups.get(lastSnapshotName);
        sqlDatabase.setData(snapshot.getData());

    }
}
