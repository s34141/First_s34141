public class Main {
    public static void main(String[] args) {


    Produkt produkt1 = new Produkt();
    produkt1.setID(1);
    produkt1.nazwa = "Produkt1";
    produkt1.kategoria = "Kategoria1";
    produkt1.cena = 2.99;
    produkt1.iloscWMagazynie = 10;

    produkt1.display();

        Produkt produkt2 = new Produkt();
        produkt2.setID(2);
        produkt2.nazwa = "Produkt2";
        produkt2.kategoria = "Kategoria2";
        produkt2.cena = 5.99;
        produkt2.iloscWMagazynie = 30;

        produkt2.display();


}
}