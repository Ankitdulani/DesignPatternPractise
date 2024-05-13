package Strategy;

import java.util.List;

public class RandomStrategy implements PlayNextStrategy{
    @Override
    public Song playNext(Song song, List<Song> songList) {
        int index = (int) (Math.random() * songList.size());
        Song nextSong = songList.get(index);
        songList.remove(index);
        return nextSong;
    }
}
