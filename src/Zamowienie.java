public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public double obliczWartoscZamowienia(){
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
        }
        return 0.0;
    }
    public void ZastosujZnizke(){
        // TODO
    }

    public void wyswietlSzczegoly() {}
        public void display() {
            System.out.println("ID: " + id);
            System.out.println("Klient: " + klient);
            System.out.println("Produkty: " + produkty);
            System.out.println("Ilosci: " + ilosci);
            System.out.println("Status: " + status);


        }
    }

