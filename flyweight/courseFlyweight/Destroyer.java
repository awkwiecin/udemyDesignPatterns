package pl.awkwiecin.flyweight.courseFlyweight;

public class Destroyer {


    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer( int x, int y) {
        this.stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
