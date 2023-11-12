import nsSum.Sum;
import nsVar.Var;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testSum() {
        Var.x_p = 2;
        Var.x_k = 10;
        Var.dx = 1;
        Var.e = 1e-5;
        Var.x = Var.x_p;
        Sum.sum();
        assertEquals(0.5493, Var.s,1e-5);
    }
}
