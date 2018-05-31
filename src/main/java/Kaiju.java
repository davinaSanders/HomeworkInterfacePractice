public abstract class Kaiju {
    protected String name;
    protected int healthValue;
    protected int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public void setHealthValue(int number) {
        this.healthValue = number;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int twentyPercentHealth(){
        return this.healthValue/5;
    }


    public abstract String roar();


    public abstract String fly();

}
