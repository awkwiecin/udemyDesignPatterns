package pl.awkwiecin.strategy.courseStrategy.eggCooker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na twardo!");
    }
}
