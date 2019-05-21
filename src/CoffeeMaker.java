public class CoffeeMaker {
    private int water=1000;
    private int sugar=50;
    private int milk=1000;
    private int beans=500;
    private int money=0;
    private int cups=20;

    public CoffeeMaker(){

    }
    public CoffeeMaker(int water, int sugar, int milk, int beans, int money, int cups) {
        this.water = water;
        this.sugar = sugar;
        this.milk = milk;
        this.beans = beans;
        this.money = money;
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getSugar() {
        return sugar;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }
    @Override
    public String toString() {
        return "Coffee machine has :\n" +
                "Water = " + water + " ml\n" +
                "Milk = " + milk +" ml\n" +
                "Coffee beans = " + beans +" gr\n" +
                "Sugar portions = " + sugar +"\n" +
                "Paper cups = " + cups +'\n' +
                "Money = " + money + " grn\n";
    }

}
