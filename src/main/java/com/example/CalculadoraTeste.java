import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(2, 3);
        assertEquals(5, resultado);
    }
}
