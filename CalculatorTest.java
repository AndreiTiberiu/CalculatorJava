package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Se initializeaza clasa calculator");
    }

    @AfterEach
    public void cleanUp() {
        calculator = null;
        System.out.println("Se curata clasa calculator din memorie");
    }

    @BeforeAll
    public static void startClasaCalculatorTest() {
        System.out.println("Incepem testarea pentru Calculator");
    }

    @AfterAll
    public static void incheiereClasaCalculatorTest() {
        System.out.println("Se incheie testarea pentru Calculator");
    }

    @Test
    @DisplayName("Suma test")
    public void sumaTest() {
        // given
        int a = 6;
        int b = 5;
        System.out.println("Ruleaza testul de suma");

        // when
        Integer sum = calculator.adunare(a, b);

        // then
        assertEquals(11, sum);
    }

    @Test
    @DisplayName("Scadere test")
    public void scadereTest() {
        int a = 7;
        int b = 3;
        Integer scadere = calculator.scadere(a, b);
        assertEquals(4, scadere);
    }

    @Test
    @DisplayName("Impartire when numarator null test")
    public void impartireWhenNumaratorNull() {
        // given
        int a = 7;
        int b = 0;

        // when
        Integer impartireNull = calculator.impartire(a, b);

        // then
        assertNull(impartireNull);
    }

    @Test
    @DisplayName("Impartire test")
    public void impartireTest() {
        // given
        int a = 8;
        int b = 2;

        // when
        Integer impartire = calculator.impartire(a, b);

        // then
        assertEquals(4, impartire);
        assertNotNull(impartire);
    }

    @Test
    @DisplayName("Inmultire test")
    public void inmultireTest() {
        // given
        int a = 5;
        int b = 5;

        // when
        Integer inmultire = calculator.inmultire(a, b);

        // then
        assertEquals(25, inmultire);
        assertNotNull(inmultire);
    }
}


