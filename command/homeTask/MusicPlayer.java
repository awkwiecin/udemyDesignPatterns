package pl.awkwiecin.command.homeTask;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    private Random rnd = new Random();

    public void playFirstTrack() {
        if (currentTrackNumber != 0) {
            System.out.println("To nie jest pierwszy utwór! Zły numer utworu!");
        }
        else
            System.out.println("Gram pierwszy utwór: " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram kolejny utwór: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTracks() {

        currentTrackNumber = rnd.nextInt(2) + 1;
        System.out.println("Gram losowy utwór: " + tracks.get(currentTrackNumber));

    }

}
