package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.SeznamZlomku;
import cz.uhk.zlomky.model.Zlomek;

public class SeznamZlomkuApp {
    public static void main(String[] args) {
        SeznamZlomku seznamZlomku = new SeznamZlomku();

        seznamZlomku.pridatZlomek(new Zlomek(1, 2));
        seznamZlomku.pridatZlomek(new Zlomek(2, 3));
        seznamZlomku.pridatZlomek(new Zlomek(-4, 5));
        seznamZlomku.pridatZlomek(new Zlomek(7, 8));

        seznamZlomku.vypisZlomky(System.out);

        // suma
        Zlomek soucet = seznamZlomku.spoctiSoucet();
        System.out.println("Soucet zlomů je " + soucet);
        System.out.println("Soucet zlomů realne je " + soucet.doubleValue());

        // soucet
        Zlomek prumer = seznamZlomku.spoctiPrumer();
        double prumerJakoCislo = prumer.doubleValue();
        System.out.printf("Průměr jako zlomk: %s\nPrůměr jako reálné číslo %s\n", prumer, prumerJakoCislo);
    }
}
