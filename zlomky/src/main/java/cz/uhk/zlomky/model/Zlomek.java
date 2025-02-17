package cz.uhk.zlomky.model;

public class Zlomek {
    private final int citatel;
    private final int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }
    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek krat(Zlomek druhy) {
        return new Zlomek(citatel * druhy.citatel, jmenovatel * druhy.jmenovatel);
    }

    public Zlomek deleno(Zlomek delitel) {
        return new Zlomek(citatel * delitel.jmenovatel, jmenovatel * delitel.citatel);
    }

    public Zlomek plus(Zlomek druhy) {
        int citatel = this.citatel * druhy.jmenovatel + druhy.citatel * this.jmenovatel;
        int jmenovatel = this.jmenovatel * druhy.jmenovatel;

        return new Zlomek(citatel , jmenovatel);
    }

    public Zlomek minus(Zlomek mencitel) {
        int citatel = this.citatel * mencitel.jmenovatel - mencitel.citatel * this.jmenovatel;
        int jmenovatel = this.jmenovatel * mencitel.jmenovatel;
        
        return new Zlomek(citatel , jmenovatel);
    }

    public Zlomek zkrat() {

        int nejvetsiSpolecnyDelitel;
        if (citatel > jmenovatel) {
            nejvetsiSpolecnyDelitel = najdiNejvetsihoSpolecnyhoDelitele(citatel, jmenovatel);
        } else {
            nejvetsiSpolecnyDelitel = najdiNejvetsihoSpolecnyhoDelitele(jmenovatel, citatel);
        }

        return new Zlomek(citatel / nejvetsiSpolecnyDelitel, jmenovatel / nejvetsiSpolecnyDelitel);
    }

    private int najdiNejvetsihoSpolecnyhoDelitele(int a, int b) {
        int zbytekPoDeleni = a % b;
        if (zbytekPoDeleni == 0) {
            return b;
        } else {
            return najdiNejvetsihoSpolecnyhoDelitele(b, zbytekPoDeleni);
        }
    }

    @Override
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }
}
