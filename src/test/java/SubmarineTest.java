import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubmarineTest {

        Submarine submarine;
        Mochii mochii;

        @Before
        public void before() {
            submarine = new Submarine("AA", 30);
            mochii = new Mochii("Matcha", 30, 6 );
        }


        @Test
        public void canGetHealthValue() {
            assertEquals(30, submarine.getHealthValue());
        }

        @Test
        public void canGetType() {
            assertEquals("AA", submarine.getType());
        }

        @Test
        public void canDestroy() {
            assertEquals("Matcha is dead!", submarine.destroy(mochii));

        }

        @Test
        public void canDestroyHealth() {
            submarine.destroy(mochii);
            assertEquals(0, mochii.getHealthValue());

        }

        @Test
        public void canDamage() {
            submarine.damage(mochii);
            assertEquals(24, mochii.getHealthValue());
        }

        @Test
        public void canDamage__submarine() {
        submarine.damage(submarine);
        assertEquals(30, submarine.getHealthValue());
        }

        @Test
        public void canTakeDamageVehicle() {
        submarine.TakeDamage();
        assertEquals(15, submarine.getHealthValue());
        }


}
