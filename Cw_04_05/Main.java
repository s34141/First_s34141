package Cw_04_05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Rap");
        lista.add("Pop");
        lista.add("Rock");
        lista.add("Indie Rock");

        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println( "Element " + i + ":" + lista.get(i));
        }

        lista.remove(0);
        System.out.println(lista);

        lista.remove("Test");
        System.out.println(lista);

        ArrayList<Integer> listaInteger = new ArrayList<>();
        System.out.println("==============");

        Playlista playlista = new Playlista("Imprezowe");
        playlista.dodajUtwor("Queen - Don't Stop Me Now");
        playlista.dodajUtwor("Queen - Don't Stop Me Now");
        playlista.dodajUtwor(null);
        playlista.dodajUtwor("");
        playlista.dodajUtwor("Dualipa - Training Season");
        playlista.dodajUtwor("The Kolors - ITALODISCO");
        playlista.dodajUtwor("Raffaella Carra - Pedro");

        playlista.usunUtwor("The Kolors - ITALODISCO");
        playlista.usunUtwor(null);
        playlista.usunUtwor("");
        playlista.usunUtwor("Luis Fonsi ft. Daddy Yankee - Despacito");
        playlista.wyswietlUtwory();
        System.out.println("==============");

        Playlista playlista2 = new Playlista ("Do Samochodu");
        playlista2.dodajUtwor("Arctic Monkeys - 505");
        playlista2.dodajUtwor("Coldplay - Viva La Vida");
        playlista2.dodajUtwor("Milky Chance - Stolen Dance");
        playlista2.dodajUtwor("Maneskin - Read Your Diary");
        playlista2.dodajUtwor("Lana Del Rey - Summertime Sadness");
        playlista2.wyswietlUtwory();
        System.out.println("==============");

        playlista.wyszukajUtwory("Pedro");
        playlista.wyszukajUtwory("Q");
        playlista.wyszukajUtwory(null);
        playlista.wyszukajUtwory("");
    }

}
