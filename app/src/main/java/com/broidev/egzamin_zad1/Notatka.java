package com.broidev.egzamin_zad1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notatka {
    public String tytul;
    public String tresc;
    public boolean wazna;
    public LocalDateTime dataDodania;

    public Notatka(String tytul, String tresc, boolean wazna) {
        this.tytul = tytul;
        this.tresc = tresc;
        this.wazna = wazna;
        this.dataDodania = LocalDateTime.now();
    }

    public Notatka(String tytul) {
        this.tytul = tytul;
        this.tresc = "";
        this.wazna = false;
        this.dataDodania = LocalDateTime.now();
    }

    public void wyswietl() {
        System.out.println("____________________");
        if (wazna) {
            System.out.println("Notatka WAŻNA! " + tytul);
        } else {
            System.out.println("Notatka " + tytul);
        }
        System.out.println(tresc);
        System.out.println(dataDodania.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
        System.out.println("____________________");
    }

    @Override
    public String toString() {
        return tytul + "\n" + tresc;
    }
}
