public class Mochii extends Kaiju implements IDamage{

    public Mochii(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }


    public String roar() {
        return "maaowww";
    }


    public String fly() {
        return this.name + " is flying!";
    }

    public void damage(IDamage object) {
        if (!(object instanceof Mochii)) {
            object.TakeDamage();
        }
    }


    public void TakeDamage(){
        this.healthValue -= twentyPercentHealth();
    }

}
