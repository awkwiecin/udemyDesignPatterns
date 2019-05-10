package pl.awkwiecin.state.homeTask;

public class CoinInsertedState implements State {
    @Override
    public void insertCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta już jest");
    }

    @Override
    public void pullTheLever(OneArmedBandit oneArmedBandit) {
        System.out.println("Pociągnięto dźwignię");
        oneArmedBandit.state = new WinningLoosingState();
    }

    @Override
    public void takeReward(OneArmedBandit oneArmedBandit) {
        System.out.println("Pociągnij dźwignię");
    }

    @Override
    public void showState(OneArmedBandit oneArmedBandit) {
        System.out.println("Stan maszyny: " + oneArmedBandit.state.toString());
    }
}
