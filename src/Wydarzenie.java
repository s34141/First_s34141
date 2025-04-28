public class Wydarzenie {

     private String nazwa;
     private String data;
     private String miejsce;
     private int maxLiczbaMiejsc = 100;
     private int dostępneMiejsca = 0;
     private double cena;

    public Wydarzenie(String nazwa) {
        this.nazwa = nazwa;
    }
    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa, double cena, String data){
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce){
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }
    public void setDostępneMiejsca(int dostepneMiejsca) {
        this.dostępneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString(){
        return "Wydarzenie: " + nazwa + ". data: " + data + ". Miejsce: " + miejsce + "cena: " + cena;
    }

    public void zarezerwujMiejsce(){
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
        }
        else {
            System.out.println("Brak dostępnych miejsc"); }
        }
    }





