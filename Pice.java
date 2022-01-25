package domaci_10;

public class Pice extends Proizvod {
    private String[] ambalaza;
    private String izborAmbalaze;

    public Pice(String barKod, String naziv, double cena, String izborAmbalaze) {
        super(barKod, naziv, cena);
        this.ambalaza = new String[]{"kartonska", "plasticna", "staklena", "limenka"};
        this.izborAmbalaze = izborAmbalaze;
        this.setCenaSaPopustom(this.getPocetnaCena() + this.getPocetnaCena() * this.cenaAmbalazeUProcentima(this.izborAmbalaze)/100);
    }

    public String[] getAmbalaza() {
        return ambalaza;
    }

    public String getIzborAmbalaze() {
        return izborAmbalaze;
    }

    public void setIzborAmbalaze(String izborAmbalaze) {
        this.izborAmbalaze = izborAmbalaze;
    }

    @Override
    public double setPopust() {
        return 0;
    }

    @Override
    public void order(int kolicina) {
        double racun = this.getCenaSaPopustom() * kolicina;
        System.out.println("Trenutna cena: " + racun);
    }


    public int cenaAmbalazeUProcentima(String vrstaAmbalaze) {
        switch (vrstaAmbalaze) {
            case "kartonska" : {
                return 10;
            }
            case "plasticna" : {
                return 20;
            }
            case "staklena" : {
               return 30;
            }
            default : {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Naziv: " + getNaziv() + "\n" + "Pocetna cena: " + getPocetnaCena() + "\n" + "Izbor ambalaze: " + getIzborAmbalaze();
    }


}
