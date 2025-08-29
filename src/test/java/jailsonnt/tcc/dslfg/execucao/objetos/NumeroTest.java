package jailsonnt.tcc.dslfg.execucao.objetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NumeroTest {

    @Test
    void testObterNumero() {
        Numero numberExample = new Numero(10.5);
        Numero numberExample2 = new Numero(200);
        assertEquals(10.5, numberExample.obterNúmero());
        assertEquals(200, numberExample2.obterNúmero());
    }

    @Test
    void testToString() {
        Numero numberExample = new Numero(25.0);
        Numero numberExample2 = new Numero(25.5);
        assertEquals("25.0", numberExample.toString());
        assertEquals("25.5", numberExample2.toString());
    }

    @Test
    void testEqual() {
        Numero numberExample = new Numero(25.0);
        Numero numberExample2 = new Numero(25);
        assertEquals(numberExample, numberExample2);
    }

    @Test
    void testNotEqual() {
        Numero numberExample = new Numero(25.0);
        Numero numberExample2 = new Numero(25.1);
        assertNotEquals(numberExample, numberExample2);
    }

    @Test
    void testCloneNotEqual() {
        Numero original = new Numero(25.0);
        Numero clone = original.clonar();
        assertEquals(original, clone);
    }
}