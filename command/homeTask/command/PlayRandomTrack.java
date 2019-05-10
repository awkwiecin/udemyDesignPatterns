package pl.awkwiecin.command.homeTask.command;

import co.devfoundry.command.homeTask.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer = new MusicPlayer();

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTracks();
    }
}
