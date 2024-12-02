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

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    public void setNazwaUzytkownika(String nazwaUzytkownika) {
        this.nazwaUzytkownika = nazwaUzytkownika;
    }

    public int getLiczbaObserwujacych() {
        return liczbaObserwujacych;
    }

    public void setLiczbaObserwujacych(int liczbaObserwujacych) {
        this.liczbaObserwujacych = liczbaObserwujacych;
    }

    public int getLiczbaPostow() {
        return liczbaPostow;
    }

    public void setLiczbaPostow(int liczbaPostow) {
        this.liczbaPostow = liczbaPostow;
    }

    public boolean isZweryfikowane() {
        return zweryfikowane;
    }

    public void setZweryfikowane(boolean zweryfikowane) {
        this.zweryfikowane = zweryfikowane;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
