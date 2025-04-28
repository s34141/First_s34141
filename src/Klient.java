import java.util.ArrayList;

public class Klient {

    String imie;
    String nazwisko;
    String email;
    ArrayList listaRezerwacji;

    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Klient(String imie, String nazwisko, String email){
        this.imie= imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public String getImię() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        System.out.println("Rezerwacja wydarzenia: " + wydarzenie);
    }

    public void wyswietlRezerwacje() {
        System.out.println(getListaRezerwacji());
    }
    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }
}
