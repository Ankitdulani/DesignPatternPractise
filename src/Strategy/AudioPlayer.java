package Strategy;

import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {

    private Song currentSong;
    private List<Song> queue = new ArrayList<>();
    private PlayNextStrategy strategy;

    public AudioPlayer() {
        currentSong = new Song();
        this.strategy = new RepeatStrategy();
    }

    public void playNext(){
        strategy.playNext(currentSong,queue);
    }
}
