package pl.awkwiecin.strategy.homeTask.pricingStrategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if (!isSignedUpForNewsletter)
            System.out.println("Cena towaru: " + price);
        else
            System.out.println("Zła strategia rabatowa!");
    }
}
