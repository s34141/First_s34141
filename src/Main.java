public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();
// Dodaj wydarzenia i klientów
        Wydarzenie koncert = new Wydarzenie("Imagine Dragons", 120.0);
        Wydarzenie impreza = new Wydarzenie("Dożynki", 25.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(impreza);
        Klient klient1 = new Klient("Adam", "Lis", "adam@example.com");
        Klient klient2 = new Klient("Anna", "Kowalczyk", "anna@example.com");
        system.dodajKlientow(klient1);
        system.dodajKlientow(klient2);
// Dokonaj rezerwacji - przekazanie obiektu Klient i Wydarzenie
        system.dokonajRezerwacji(klient1, koncert);
        system.dokonajRezerwacji(klient1, impreza);
        system.dokonajRezerwacji(klient2, koncert);
// Wyświetl rezerwacje klienta
        System.out.println("Rezerwacje klienta " + klient1.getImię() + " " +
                klient1.getNazwisko() + ":");
        klient1.wyswietlRezerwacje();
// Pobierz referencję do wydarzenia z systemu
        Wydarzenie koncertRef = system.znajdzWydarzenie("Imagine Dragons");
// Modyfikacja wydarzenia przez referencję - wpłynie na wszystkich klientów, którzy mają
        //to wydarzenie;
        System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
        koncertRef.setCena(150.0);
// Sprawdź czy zmiany są widoczne w rezerwacjach klientów
        System.out.println("\nRezerwacje klienta " + klient1.getImię() + " " +
                klient1.getNazwisko() + " po zmianie ceny:");
        klient1.wyswietlRezerwacje();
        System.out.println("\nRezerwacje klienta " + klient2.getImię() + " " +
                klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyswietlRezerwacje();
// Klient anuluje rezerwację - operacja na referencjach
        System.out.println("\nKlient " + klient1.getImię() + " anuluje rezerwację na teatr:");
        klient1.anulujRezerwacje(impreza);
        klient1.wyswietlRezerwacje();
// Sprawdź liczbę dostępnych miejsc na koncercie (powinna być o 2 mniejsza od max)
        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostępneMiejsca() +
                " z " + koncert.getMaxLiczbaMiejsc());
    }
}