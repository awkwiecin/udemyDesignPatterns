package pl.awkwiecin.strategy.homeTask;

import co.devfoundry.strategy.homeTask.pricingStrategy.PricingStrategy;

public class PriceCalculator  {

    PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price,isSignedUpForNewsletter);
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
