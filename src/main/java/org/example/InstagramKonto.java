package org.example;

public class InstagramKonto {
    String nazwaUzytkownika;
    int liczbaObserwujacych;
    int liczbaPostow;
    boolean zweryfikowane;
    String opis;


    InstagramKonto(String nazwaUzytkownika) {
        System.out.println("Użyto konstruktor 1 ");
        this.nazwaUzytkownika = nazwaUzytkownika;
    }

    InstagramKonto(String nazwaUzytkownika, int liczbaObserwujacych ){
        System.out.println("Użyto konstruktor 2 ");
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.liczbaObserwujacych = liczbaObserwujacych;
    }
    InstagramKonto(String nazwaUzytkownika,int liczbaObserwujacych, int liczbaPostow, boolean zweryfikowane , String opis){
        System.out.println("Użyto konstruktor 3 ");
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.liczbaObserwujacych = liczbaObserwujacych;
        this.liczbaPostow = liczbaPostow;
        this.zweryfikowane = zweryfikowane;
        this.opis = opis;
    }

    public String opisKonta(){

        return "Konto: " + nazwaUzytkownika + " Obserwujący: "+ liczbaObserwujacych + " Posty: " + liczbaPostow + " Zweryfikowane: "+ zweryfikowane + " Opis: " + opis;

    }

}
