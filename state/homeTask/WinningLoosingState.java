package pl.awkwiecin.state.homeTask;

import java.util.Random;

public class WinningLoosingState implements State {

    private boolean win;

    @Override
    public void insertCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta już wrzucona");
    }

    @Override
    public void pullTheLever(OneArmedBandit oneArmedBandit) {
        System.out.println("Dźwignia już pociągnięta");
    }

    @Override
    public void takeReward(OneArmedBandit oneArmedBandit) {
        win=game();

        if (win)
            System.out.println("Proszę wziąć nagrodę");
        else
            System.out.println("Sorry nie ma nagrody");

         oneArmedBandit.state=new NoCoinState();

    }

    @Override
    public void showState(OneArmedBandit oneArmedBandit) {
        System.out.println("Stan maszyny: " + oneArmedBandit.state.toString());
    }

    private boolean game() {
        double d = Math.random() * 100;
        if ((d -= 20) < 0) return true;
        else return false;
    }
}
