package cz.uhk.zlomky.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

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

    // TODO ODEBRAT Z PRÁZDNÉHO
    // TODO ODEBRAT NEEXISTUJÍCÍ
    // TODO ODEBRAT NORMÁLNĚ
    @Test
    void testOdebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        seznam.odebratZlomek(0);

        assertEquals(0, seznam.pocetZlomku());
    }   

    // TODO SPOČÍST NORMÁLNĚ
    // TODO SPOČÍST PRÁZDNÉ
    @Test
    void testSpoctiPrumer() {
        fail();
    }

    // TODO SPOČÍST NORMÁLNĚ
    // TODO SPOČÍST PRÁZDNÉ
    // TODO PAK POSLAT NA EMAIL
    @Test
    void testSpoctiSoucet() {
        fail();
    }


    @Test
    void testVypisZlomky() {
        seznam.vypisZlomky(System.out);
    }
}
