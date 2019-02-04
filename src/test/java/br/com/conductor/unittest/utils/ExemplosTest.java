package br.com.conductor.unittest.utils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Boolean.TRUE;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@Tag("exemplos")
class ExemplosTest {

    private static final boolean PODE_RODAR_TEST = TRUE.toString().equals(System.getenv("VARIAVEL_AMBIENTE_UNIT_TEST"));

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void parameterizedTest(String parametro) {

    }

    @RepeatedTest(10)
    void repeatedTest() {

    }

    @Test
    @Disabled
    void timeoutExcedido() {
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    void assumeTrueTest() {
        assumeTrue(PODE_RODAR_TEST);
        System.out.println("Eu sou vou ser executado caso o assume seja true");
    }

    @Test
    void assumeTrueComMessageTest() {
        assumeTrue(PODE_RODAR_TEST,
            () -> "Teste desabilitado!");
        System.out.println("Eu sou vou ser executado caso o assume seja true");
    }

    @Test
    void assumeThatTest() {
        assumingThat(PODE_RODAR_TEST,
            () -> {
                System.out.println("Eu sou vou ser executado caso o assume seja true");
                assertEquals(2, 2);
            });

        assertEquals("a string", "a string");
        System.out.println("Eu sou vou ser executado independentemente");
    }

}
