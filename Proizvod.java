package domaci_10;

public abstract class Proizvod {
    private String barKod;
    private String naziv;
    private double pocetnaCena;
    private double cenaSaPopustom;

    public Proizvod(String barKod, String naziv, double cena) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.pocetnaCena = cena;
        this.cenaSaPopustom = cena;
        if (cena > 200) {
            this.cenaSaPopustom = cena - cena * 15 / 100;
        }
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPocetnaCena() { return this.pocetnaCena; }

    public void setCenaSaPopustom(double cena) {
        this.cenaSaPopustom = cena;
    }

    public double getCenaSaPopustom() { return this.cenaSaPopustom; }


    public abstract double setPopust();

    public abstract void order(int kolicina);

    @Override
    public abstract String toString();




}
