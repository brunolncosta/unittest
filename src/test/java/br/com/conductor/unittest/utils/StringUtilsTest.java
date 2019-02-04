package br.com.conductor.unittest.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@Tag("utils")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class StringUtilsTest {

    private StringUtils utils;

    @BeforeEach
    private void beforeAll() {
        System.out.println("Entrei aqui ao instanciar a classe de teste.");
    }

    @BeforeEach
    private void beforeEach() {
        System.out.println("Entrei aqui antes de chamar cada metodo do teste.");
    }

    @Test
    void getSizeTest() {
        StringUtils utils = new StringUtils();
        assertEquals(5, utils.getSize("cinco"));
    }

    @Test
    void getSizeNullValueTest() {
        StringUtils utils = new StringUtils();
        assertThrows(StringInvalidaException.class, () -> utils.getSize(null));
    }

    @Test
    private void esteTestNaoVaiRodar() {
        fail();
    }

    public static void main(String...args) {
        StringUtils utils = new StringUtils();
        System.out.println(utils.fieldPackagePrivate);
    }

}
