package pl.awkwiecin.command.homeTask.command;

import co.devfoundry.command.homeTask.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer = new MusicPlayer();

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
