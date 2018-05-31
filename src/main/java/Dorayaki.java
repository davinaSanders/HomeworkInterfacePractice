public class Dorayaki extends Kaiju implements IDestroy{

    public Dorayaki(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }



    public String roar() {
        return "kikiriki";
    }

    public void destroy() {

    }

    public String kill() {
        return "This is dead!"
    }

    public String fly() {
        return this.name + " is flying!";
    }
}
