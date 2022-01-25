package domaci_10;
import java.time.LocalDate;

public class Prehrambeni extends Proizvod {
    private LocalDate datumisteka;

    public Prehrambeni(String barKod, String naziv, double cena, LocalDate datumisteka) {
        super(barKod, naziv, cena);
        this.datumisteka = datumisteka;
    }

    public LocalDate getDatumisteka() {
        return datumisteka;
    }

    public void setDatumisteka(LocalDate datumisteka) {
        this.datumisteka = datumisteka;
    }

    @Override
    public double setPopust() {
        return 0;
    }

    @Override
    public void order(int kolicina) {
        if (this.datumisteka.isAfter(LocalDate.now())) {
            System.out.println("Rok trajanja vazi");
            System.out.println("Trenutna cena: " + (this.getCenaSaPopustom() * kolicina));
        } else if (this.datumisteka.isBefore(LocalDate.now())){
            System.out.println("Datum je istekao!");
        }
    }
    @Override
    public String toString() {
        return "Naziv: " + getNaziv() + "\n" + "Pocetna cena: " + getPocetnaCena() + "\n" + "Datum isteka: " + getDatumisteka();
    }

}
