package cz.uhk.zlomky;

import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {

    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        // vytvoreni instance(=objektu) tridy Zlomek
        Zlomek a = new Zlomek(3, 4);
        System.out.printf("Zlomek a = %s\n", a);

        Zlomek b = new Zlomek(2, 5);
        System.out.printf("Zlomek b = %s\n", b);

        Zlomek c = a.krat(b);
        System.out.printf("Zlomek a * b = %s\n", c.zkrat());
        System.out.printf("Zlomek a / b = %s\n", a.deleno(b).zkrat());
        System.out.printf("Zlomek a + b = %s\n", a.plus(b));
        System.out.printf("Zlomek a - b = %s\n", a.minus(b));

    }
}