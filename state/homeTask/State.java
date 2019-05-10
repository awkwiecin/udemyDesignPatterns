package pl.awkwiecin.state.homeTask;

public interface State {
    void insertCoin(OneArmedBandit oneArmedBandit);
    void pullTheLever(OneArmedBandit oneArmedBandit);
    void takeReward(OneArmedBandit oneArmedBandit);
    void showState(OneArmedBandit oneArmedBandit);
}
