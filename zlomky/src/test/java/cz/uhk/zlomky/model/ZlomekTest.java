package cz.uhk.zlomky.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ZlomekTest {
    
    @Test
    public void krat() {
        Zlomek a = new Zlomek(4, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.krat(b);

        assertEquals(12, c.getCitatel());
        assertEquals(20, c.getJmenovatel());


        a = new Zlomek(4, 0);
        b = new Zlomek(3, 4);
        c = a.krat(b);

        assertEquals(12, c.getCitatel());
        assertEquals(0, c.getJmenovatel());
    }

    @Test
    public void deleno() {
        Zlomek a = new Zlomek(4, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.deleno(b);

        assertEquals(16, c.getCitatel());
        assertEquals(15, c.getJmenovatel());


        a = new Zlomek(4, 0);
        b = new Zlomek(3, 4);
        c = a.deleno(b);

        assertEquals(16, c.getCitatel());
        assertEquals(0, c.getJmenovatel());
    }

    @Test
    public void plus() {
        Zlomek a = new Zlomek(4, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.plus(b);

        assertEquals(31, c.getCitatel());
        assertEquals(20, c.getJmenovatel());


        a = new Zlomek(4, 0);
        b = new Zlomek(3, 4);
        c = a.plus(b);

        assertEquals(16, c.getCitatel());
        assertEquals(0, c.getJmenovatel());
    }

    @Test
    public void minus() {
        Zlomek a = new Zlomek(4, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.minus(b);

        assertEquals(1, c.getCitatel());
        assertEquals(20, c.getJmenovatel());


        a = new Zlomek(4, 0);
        b = new Zlomek(3, 4);
        c = a.minus(b);

        assertEquals(16, c.getCitatel());
        assertEquals(0, c.getJmenovatel());
    }

    @Test
    public void zkrat() {
        Zlomek a = new Zlomek(4, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.krat(b).zkrat();

        assertEquals(3, c.getCitatel());
        assertEquals(5, c.getJmenovatel());


        a = new Zlomek(4, 0);
        b = new Zlomek(3, 4);
        c = a.krat(b).zkrat();

        assertEquals(16, c.getCitatel());
        assertEquals(0, c.getJmenovatel());
    }

}
