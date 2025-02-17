package cz.uhk.zlomky;

import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {

    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        // vytvoreni instance(=objektu) tridy Zlomek
        Zlomek a = new Zlomek(3, 4);

        System.out.printf("Zlomek a = %s\n", a);
    }
}