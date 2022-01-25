package domaci_10;

public class AlkoholnaPica extends Pice{
    private double procenatAlkohola;

    public AlkoholnaPica(String barKod, String naziv, double cena, double procenatAlkohola, String izborAmbalaze) {
        super(barKod, naziv, cena, izborAmbalaze);
        this.procenatAlkohola = procenatAlkohola;
        // 50% popusta na alkoholna pica
        this.setCenaSaPopustom(this.getCenaSaPopustom() - this.getCenaSaPopustom()*50/100);
    }

    public double getProcenatAlkohola() {
        return procenatAlkohola;
    }

    public void setProcenatAlkohola(double procenatAlkohola) {
        this.procenatAlkohola = procenatAlkohola;
    }

    @Override
    public String toString() {
        return "Naziv: " + getNaziv() + "\n" + "Pocetna cena: " + getPocetnaCena() + "\n" + "Izbor ambalaze: " + getIzborAmbalaze() +"\n"+ "Procenat alkohola: " + getProcenatAlkohola() ;
    }
}
