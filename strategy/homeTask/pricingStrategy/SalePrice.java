package pl.awkwiecin.strategy.homeTask.pricingStrategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if (isSignedUpForNewsletter)
            System.out.println("Cena towaru: " + 0.5*price);
        else
            System.out.println("Zła strategia rabatowa!");

    }
}
