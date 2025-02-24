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

        Zlomek[] poleZlomku = new Zlomek[4];
        poleZlomku[0] = a;
        poleZlomku[1] = b;
        poleZlomku[2] = c;
        poleZlomku[3] = new Zlomek(3, 0);

        try {
            Zlomek suma = sumaZlomku(poleZlomku);
            System.out.printf("Suma pole: %s\n", suma);
            
        } catch (ArithmeticException e) {
            System.out.println("Chyba při výpočtu sumy zlomku: " + e.getMessage());
            e.printStackTrace();
        }


        Number[] pole2 = new Number[8];
        for (int i = 0; i < poleZlomku.length; i++) {
            pole2[i] = poleZlomku[i];
        }
        pole2[4] = 10;
        pole2[5] = 20;
        pole2[6] = 30.025;
        pole2[7] = 40;
        double suma = 0;
        for (Number number : pole2) {
            System.out.printf("%s\n", number);
            suma += number.doubleValue();
        }
        System.out.printf("Soucet je %s\n", suma);
    }

    public static Zlomek sumaZlomku(Zlomek[] pole) {
        Zlomek soucet = new Zlomek(0, 1);
    
        for (Zlomek z : pole) {
            soucet = soucet.plus(z);
        }

        return soucet.zkrat();
    }
}