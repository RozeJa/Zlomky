package cz.uhk.zlomky.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SeznamZlomku {
    private List<Zlomek> zlomky = new ArrayList<>();

    public void pridatZlomek(Zlomek zlomek) {
        if (zlomek != null) {
            zlomky.add(zlomek);
        } else {
            throw new NullPointerException();
        }
    }

    public void odebratZlomek(int index) {
        zlomky.remove(index);
    }

    public Zlomek vratZlomek(int index) {
        return zlomky.get(index);
    }

    public void vypisZlomky(PrintStream out) {
        out.println("Výpis zlomků: ");
        for (int i = 0; i < zlomky.size(); i++) {
            out.printf("[%d] => %s\n", i+1, zlomky.get(i));
        }
    }

    public Zlomek spoctiSoucet() {
        Zlomek soucet = new Zlomek(0, 1);

        for (Zlomek zlomek : zlomky) {
            soucet = soucet.plus(zlomek);
        }

        return soucet.zkrat();
    }

    public Zlomek spoctiPrumer() {
        Zlomek soucet = spoctiSoucet();

        return new Zlomek(soucet.getCitatel(), soucet.getJmenovatel() * zlomky.size()).zkrat();
    }

    public int pocetZlomku() {
        return zlomky.size();
    }
}
