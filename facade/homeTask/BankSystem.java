package pl.awkwiecin.facade.homeTask;

public class BankSystem {

    void transferMoney() {
        System.out.println("Money transfered.");
    }

    boolean validatePin() {
        System.out.println("PIN validated.");
        return true;
    }

    boolean validateTransaction() {
        System.out.println("Transaction validated.");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("You had some payments.");
    }

}
