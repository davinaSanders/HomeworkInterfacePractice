public class Submarine extends Vehicles implements IDamage {

    public Submarine(String type, int healthValue) {
        super(type, healthValue);
    }

    public void damage(IDamage object) {
        if (!(object instanceof Submarine)) {
            object.TakeDamage();
        }
    }

    public int fiftyPercentHealth() {
        return this.healthValue/2;

    }

    public void TakeDamage(){
        this.healthValue = fiftyPercentHealth();
    }
}

