package pl.awkwiecin.state.homeTask;

public class OneArmedBandit {

    State state = new  NoCoinState();

    public void instertCOin() {
        state.insertCoin(this);
    }
    public void pullTheLever() {
        state.pullTheLever(this);
    }
    public void takeReward() {
        state.takeReward(this);
    }

    public State getState() {
        return state;
    }

    public void showState(State state) {
        state.showState(this);
    }
}
