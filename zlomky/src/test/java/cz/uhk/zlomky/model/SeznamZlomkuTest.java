package cz.uhk.zlomky.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeznamZlomkuTest {

    SeznamZlomku seznam;

    @BeforeEach
    void setUp() { 
        seznam = new SeznamZlomku();
    }

    @Test
    @DisplayName("Test pridavani")
    void testPridatZlomek() {
        Zlomek zlomek = new Zlomek(3, 5);
        seznam.pridatZlomek(zlomek);

        assertEquals(1, seznam.pocetZlomku(), "Počet zlomku");
    }

    @Test
    void pridatZlomekNull() {
        assertThrows(NullPointerException.class, () -> seznam.pridatZlomek(null));
    }

    @Test
    void testVratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vratZlomek(0));
    }

    @Test
    void testVratZlomek() {
        
        Zlomek zlomek = new Zlomek(3, 5);
        seznam.pridatZlomek(zlomek);

        assertEquals(zlomek, seznam.vratZlomek(0));
    }

    @Test
    void testOdebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        seznam.odebratZlomek(0);

        assertEquals(0, seznam.pocetZlomku());
    }   

    @Test
    void testOdebratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.odebratZlomek(0));
    }   


    @Test
    void testSpoctiPrumer() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(1, 4));
        seznam.pridatZlomek(new Zlomek(1, 8));
        seznam.pridatZlomek(new Zlomek(1, 8));

        Zlomek prumer  = seznam.spoctiPrumer();

        assertEquals("1 / 4", prumer.toString());
    }

    @Test 
    void testSpoctiPrumerNaPrazdnem() {
        assertThrows(ArithmeticException.class, () -> seznam.spoctiPrumer());
    }

    @Test
    void testSpoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(1, 4));
        seznam.pridatZlomek(new Zlomek(1, 8));
        seznam.pridatZlomek(new Zlomek(1, 8));

        assertEquals(1., seznam.spoctiSoucet().doubleValue());
    }

    @Test
    void testSpoctiSoucetNaPrazdnem() {
        assertThrows(ArithmeticException.class, () -> seznam.spoctiSoucet());
    }

    @Test
    void testVypisZlomky() {
        seznam.vypisZlomky(System.out);
    }
}
