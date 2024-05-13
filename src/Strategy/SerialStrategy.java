package Strategy;

import java.util.List;

public class SerialStrategy implements PlayNextStrategy{
    @Override
    public Song playNext(Song song, List<Song> songList) {
        Song nextSong = songList.get(songList.size()-1);
        songList.remove(songList.size()-1);
        return nextSong;
    }
}
