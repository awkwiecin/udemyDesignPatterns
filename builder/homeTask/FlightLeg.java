package pl.awkwiecin.builder.homeTask;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed = false;
    private int price;

    private FlightLeg (FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.price = flightLegBuilder.price;
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public int getPrice() {
        return price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private int price;

        public FlightLegBuilder(String initFrom, String initTo, int initPrice) {
            this.from=initFrom;
            this.to = initTo;
            this.price=initPrice;
        }
        public FlightLegBuilder buildFrom(String from) {
            this.from=from;
            return this;
        }

        public FlightLegBuilder buildTo(String to) {
            this.to=to;
            return this;
        }

        public FlightLegBuilder buildPrice(int price) {
            this.price=price;
            return this;
        }
        public FlightLeg build() {
            return new FlightLeg(this);
        }
    }
}
