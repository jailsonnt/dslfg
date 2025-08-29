package jailsonnt.tcc.dslfg.execucao.objetos

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class BooleanoTest {

    @Test
    fun `should return the correct boolean value`() {
        val trueBoolean = Booleano(true)
        val falseBoolean = Booleano(false)

        assertEquals(true, trueBoolean.obterBooleano())
        assertEquals(false, falseBoolean.obterBooleano())
    }

    @Test
    fun `should return the correct string representation`() {
        val trueBoolean = Booleano(true)
        val falseBoolean = Booleano(false)

        assertEquals("verdadeiro", trueBoolean.toString())
        assertEquals("falso", falseBoolean.toString())
    }

    @Test
    fun `should be equal to another boolean with the same value`() {
        val boolean1 = Booleano(true)
        val boolean2 = Booleano(true)
        assertEquals(boolean1, boolean2)
    }

    @Test
    fun `should not be equal to another boolean with a different value`() {
        val boolean1 = Booleano(true)
        val boolean2 = Booleano(false)
        assertNotEquals(boolean1, boolean2)
    }

    @Test
    fun `should create an identical clone`() {
        val original = Booleano(true)
        val clone = original.clonar()
        assertEquals(original, clone)
    }
}
