package domaci_10;

import java.time.LocalDate;
import java.util.Scanner;

public class test_proizvoda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Proizvod prehrambeni = new Prehrambeni("005bk", "hleb", 50, LocalDate.of(2022, 10, 30) );
        Proizvod televizor = new Tehnika("006bk", "Sony", 30000, 16);
        Proizvod pice = new Pice("007bk", "kafa", 189, "kartonska");
        Proizvod cocaCola = new Pice("009bk", "Coca-Cola", 150, "plasticna");
        Proizvod rakija = new AlkoholnaPica("008bk", "Rakija", 670, 40, "staklena");


        Proizvod[] nizProizvoda = new Proizvod[] {prehrambeni, televizor, pice, rakija, cocaCola};

        Kupac kupac1 = new Kupac("Aleksa", "Filipovic");
        Korpa korpa1 = new Korpa(kupac1);

        boolean kupovina = true;

        while(kupovina) {
            System.out.println("Unesite bar kod proizvoda koji zelite da dodate u korpu: ");
            String barKod = input.nextLine();
            boolean pronadjen = false;
            if (barKod.equals("zavrsi kupovinu")) {
                kupovina = false;
                break;
            }
            for (Proizvod proizvod : nizProizvoda) {
                if (barKod.equals(proizvod.getBarKod())) {
                    korpa1.dodajProizvod(proizvod);
                    System.out.println("Proizvod " + proizvod.getNaziv() + " je dodat u korpu.");
                    pronadjen = true;
                }
            }
            if (!pronadjen) {
                System.out.println("Uneli ste pogresan barkod");
            }
        }
        korpa1.ispisiRacun();



    }
}
