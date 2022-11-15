public class Fish {
    protected int health;
    protected int coinsGiven;
    protected String fishName;
    public int getCoinsGiven() {
        return coinsGiven;
    }
    public int getHealth() {
        return health;
    }
    public String getFishName() {
        return fishName;
    }
    public void setCoinsGiven(int coinsGiven) {
        this.coinsGiven = coinsGiven;
    }
    public void setFishName(String fishName) {
        this.fishName = fishName;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
