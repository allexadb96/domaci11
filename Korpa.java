package domaci_10;
import java.util.HashMap;
import java.util.Map;

public class Korpa {
    private Kupac kupac;
    private Map<Proizvod, Integer> kolicineProizvoda;

    public Korpa(Kupac kupac) {
        this.kupac = kupac;
        this.kolicineProizvoda = new HashMap<>();
        }

    /**
     * Dodaje proizvod u korpu ako se proizvod ne nalazi u korpi, a ako se nalazi povecava mu kolicinu za 1.
     * @param proizvod
     */
    public void dodajProizvod(Proizvod proizvod) {
        if (kolicineProizvoda.containsKey(proizvod)) {
            kolicineProizvoda.put(proizvod, kolicineProizvoda.get(proizvod) + 1);
        }
        else {
            kolicineProizvoda.put(proizvod,  1);
        }
    }

    public void ispisiRacun() {
        double racun = 0;
        for(Proizvod proizvodUKorpi: this.kolicineProizvoda.keySet()){
            System.out.print(proizvodUKorpi.getNaziv() + " ");
            System.out.print("x"+this.kolicineProizvoda.get(proizvodUKorpi));
            double ukupnaCena = proizvodUKorpi.getCenaSaPopustom() * this.kolicineProizvoda.get(proizvodUKorpi);
            System.out.print(" "+ukupnaCena);
            System.out.println();
            racun += ukupnaCena;
        }
        System.out.println();
        System.out.println("Za uplatu: " + racun);
    }


    public Kupac getKupac() {
        return this.kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Map<Proizvod, Integer> getProizvodi() {
        return this.kolicineProizvoda;
    }

}
