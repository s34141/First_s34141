public class Produkt {
    int id;
    String nazwa;
    double cena;
    String kategoria;
    int iloscWMagazynie;

    //setter
    public void setID(int id) {
        if(id < 0) {
            this.id = id;
        } else {
            this.id = id;
        }
    }

    //getter
    public int getID() {
        return this.id;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Kategoria: " + kategoria);
        System.out.println("Ilosc wMagazynie: " + iloscWMagazynie);
    }
}
