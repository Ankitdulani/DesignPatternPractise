package Strategy;

import java.util.List;
import java.util.Queue;

public class RepeatStrategy implements PlayNextStrategy {

    @Override
    public Song playNext(Song song, List<Song> songList) {
        return song;
    }
}
