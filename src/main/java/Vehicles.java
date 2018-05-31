public abstract class Vehicles {
    protected String type;
    protected int healthValue;

    public Vehicles(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;

    }

    public String getType() {
        return this.type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }



    public String destroy(Kaiju kaiju){
        kaiju.setHealthValue(0);
        return kaiju.getName() + " is dead!";

    }


}
