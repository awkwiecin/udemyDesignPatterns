package pl.awkwiecin.state.homeTask;

public class NoCoinState implements State {
    @Override
    public void insertCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta włożona");
        oneArmedBandit.state= new CoinInsertedState();
    }

    @Override
    public void pullTheLever(OneArmedBandit oneArmedBandit) {
        System.out.println("Włóż monetę");
    }

    @Override
    public void takeReward(OneArmedBandit oneArmedBandit) {
        System.out.println("Włóż monetę");
    }

    @Override
    public void showState(OneArmedBandit oneArmedBandit) {
        System.out.println("Stan maszyny: " + oneArmedBandit.state.toString());
    }
}
