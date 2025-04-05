
public class Klient {
    private  int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

public void display() {
    System.out.println("Id: " + id);
    System.out.println("Imie: " + imie);
    System.out.println("Nazwisko: " + nazwisko);
    System.out.println("Email: " + email);
    System.out.println("CzyStaly: " + czyStaly);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }

    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
}
