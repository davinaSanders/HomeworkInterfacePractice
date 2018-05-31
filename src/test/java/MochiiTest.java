import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MochiiTest {

    Mochii mochii;
    Submarine submarine1;

    @Before
    public void before() {
        mochii = new Mochii("Tamago", 30, 6 );
        submarine1 = new Submarine("TT", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Tamago", mochii.getName());
    }

    @Test
    public void canFly() {
        assertEquals("Tamago is flying!", mochii.fly());
    }

    @Test
    public void canRoar() {
        assertEquals("maaowww", mochii.roar());
    }

    @Test
    public void hasHealthValue(){
        assertEquals( 30, mochii.getHealthValue());
    }

    @Test
    public void canSetHealthValue(){
        mochii.setHealthValue(50);
        assertEquals(50, mochii.getHealthValue());
    }

    @Test
    public void getTwentyPercentHealth() {
        assertEquals(6, mochii.twentyPercentHealth());
    }

    //functionality

    @Test
    public void canTakeDamage() {
        mochii.TakeDamage();
        assertEquals(24, mochii.getHealthValue());
    }

    @Test
    public void canDamage(){
        mochii.damage(submarine1);
        assertEquals(50, submarine1.getHealthValue());
    }

    @Test
    public void canDamage__mochii(){
        mochii.damage(mochii);
        assertEquals(30, mochii.getHealthValue());
    }

}
