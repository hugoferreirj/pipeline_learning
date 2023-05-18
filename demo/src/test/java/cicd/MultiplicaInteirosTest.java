package cicd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicaInteirosTest 
{
    @Test
    public void testMultiplicaInteiros() {
        MultiplicaInteiros multiplicaInteiros = new MultiplicaInteiros();

        int resultado1 = multiplicaInteiros.multiplicar(5, 3);
        assertEquals(15, resultado1);

        int resultado2 = multiplicaInteiros.multiplicar(-3, 3);
        assertEquals(-9, resultado2);

        int resultado3 = multiplicaInteiros.multiplicar(0, 0);
        assertEquals(0, resultado3);
    }
}
