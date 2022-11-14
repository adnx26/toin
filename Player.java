class Player{
    private int health = 20;
    private int coins = 100;

    private int randomNum(int min, int max){
        return min + (int)(Math.random() * max);
    }

    public void setHealth(int value){
        health = value;
    }
    public int getHealth(){
        return health;
    }
    public void setCoins(int value){
        coins = value;
    }
    public int getCoins(){
        return coins;
    }
    public void addCoins(float value){
        coins += value;
    }
}