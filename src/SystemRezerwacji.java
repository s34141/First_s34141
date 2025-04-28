import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen;
    private ArrayList<Klient> listaKlientow;


    public SystemRezerwacji() {
        listaWydarzen = new ArrayList<>();
        listaKlientow = new ArrayList<>();
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
    }
    public void dodajWydarzenie(String nazwa, String data, String miejsce, double cena) {
        Wydarzenie noweWydarzenie = new Wydarzenie(nazwa, cena, miejsce, data);
        listaWydarzen.add(noweWydarzenie);
    }
    public void dodajKlientow(Klient klient) {
        listaKlientow.add(klient);
    }
    public void dodajKlientow(String imie, String nazwisko, String email) {
        Klient klient = new Klient(imie, nazwisko, email);
        listaKlientow.add(klient);
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostępneMiejsca() > 0) {
            wydarzenie.zarezerwujMiejsce();
            klient.dodajRezerwacje(wydarzenie);
            System.out.println("Rezerwacja dokonana pomyślnie.");
        } else {
            System.out.println("Brak dostępnych miejsc");
        }

    }
    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie wydarzenie : listaWydarzen) {
            if (wydarzenie.getNazwa().equalsIgnoreCase(nazwa)) {
                return wydarzenie;
            }
        }
        return null;
    }
    public Klient znajdzKlienta(String nazwisko) {
        for (Klient klient : listaKlientow) {
            if (klient.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return klient;
            }
        }
        return null; }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
            System.out.println("Cena wydarzenia " + nazwa + " została zmieniona na " + nowaCena + " zł.");
        } else {
            System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
        }
    }

        }






