class Player{
    private int health = 20;
    private int coins = 100;

    private int randomNum(int min, int max){
        return min + (int)(Math.random() * max);
    }

    public void run(String str){
        System.out.println("ran");
        if(str.equals("fish")){
            fish();
        }
    }
    
    public void fish(){
        int earned = randomNum(2, 10);
        coins+=earned;
        String s = (earned >6)? ("What a big fish!") : ("What a small fish!");
        System.out.println(s + "\nYou got " + earned + " coins");
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