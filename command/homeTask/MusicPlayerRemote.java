package pl.awkwiecin.command.homeTask;

import co.devfoundry.command.homeTask.command.MusicPlayerCommand;

public class MusicPlayerRemote {

    MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        musicPlayerCommand.play();
    }
}
