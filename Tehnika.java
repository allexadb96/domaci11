package domaci_10;

public class Tehnika extends Proizvod{
    private String garancija;
    private double tezina;

    public Tehnika(String barKod, String naziv, double cena, double tezina) {
        super(barKod, naziv, cena);
        this.tezina = tezina;
    }

    public String getGarancija() {
        return garancija;
    }

    public void setGarancija(String garancija) {
        this.garancija = garancija;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    @Override
    public double setPopust() {
        return 0;
    }

    @Override
    public void order(int kolicina) {
        if (this.getTezina() > 30) {
            System.out.println("Dostava do vrata");
        }
        double racun = this.getCenaSaPopustom() * kolicina;
        System.out.println("Trenutna cena: " + racun);
    }
    @Override
    public String toString() {
        return "Naziv: " + getNaziv() + "\n" + "Pocetna cena: " + getPocetnaCena() + "\n" + "Tezina: " + getTezina() + "\n" + "Garancija: " + getGarancija();
    }

}
