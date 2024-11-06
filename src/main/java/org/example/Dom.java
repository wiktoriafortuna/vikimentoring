package org.example;

public class Dom {
    private String adres;
    private int powierzchnia;
    private int liczbaPokoi;

    Dom(String adres, int powierzchnia, int liczbaPokoi) {
        this.adres = adres;
        this.powierzchnia = powierzchnia;
        this.liczbaPokoi = liczbaPokoi;
    }

    String getAdres() {
        return adres;
    }

    int getPowierzchnia() {
        return powierzchnia;
    }

    int getLiczbaPokoi() {
        return liczbaPokoi;
    }

    void setAdres(String adres) {
        if (adres.length() <= 10) {
            System.out.println("Adres jest za krótki!");
        } else {
            this.adres = adres;
        }


    }


    void setPowierzchnia(int powierzchnia) {
        if (powierzchnia <= 20) {
            System.out.println("Powierzchnia nie może być mniejsza niż 20 m²");

        } else {
            this.powierzchnia = powierzchnia;
        }
    }


        void setLiczbaPokoi(int liczbaPokoi) {
            this.liczbaPokoi = liczbaPokoi;
        }

}
