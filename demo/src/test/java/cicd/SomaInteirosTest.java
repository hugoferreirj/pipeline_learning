package cicd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomaInteirosTest 
{
    @Test
    public void testSomaInteiros() {
        SomaInteiros somaInteiros = new SomaInteiros();

        int resultado1 = somaInteiros.somar(5, 3);
        assertEquals(8, resultado1);

        int resultado2 = somaInteiros.somar(-3, 3);
        assertEquals(0, resultado2);

        int resultado3 = somaInteiros.somar(0, 0);
        assertEquals(0, resultado3);
    }
}
