package Strategy;

import javax.sound.sampled.AudioSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public interface PlayNextStrategy {

    public abstract Song playNext(Song song, List<Song> songList);
}
