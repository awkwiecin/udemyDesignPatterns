package pl.awkwiecin.command.homeTask.command;

import co.devfoundry.command.homeTask.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
