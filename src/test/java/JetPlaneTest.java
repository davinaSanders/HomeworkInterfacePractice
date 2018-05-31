import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JetPlaneTest {

    JetPlane jetplane;

    @Before
    public void before() {
        jetplane = new JetPlane("XX", 40);
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(40, jetplane.getHealthValue());
    }

    @Test
    public void canGetType() {
        assertEquals("XX", jetplane.getType());
    }

}
