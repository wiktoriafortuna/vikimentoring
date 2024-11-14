package org.example;

public class Tancerz {
   public String imie;
   public String kraj;
   public int wiek;
   public String stylTanca;
   public double ocena;
    Tancerz(String imie, String kraj) {
        this.imie = imie;
        this.kraj = kraj;

    }
    Tancerz(String imie, String kraj, int wiek) {
        this.imie = imie;
        this.kraj = kraj;
        this.wiek = wiek;
    }
    Tancerz(String imie, String kraj, int wiek,String stylTanca, double ocena) {
        this.imie = imie;
        this.kraj = kraj;
        this.wiek = wiek;
        this.stylTanca = stylTanca;
        this.ocena = ocena;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getStylTanca() {
        return stylTanca;
    }

    public void setStylTanca(String stylTanca) {
        this.stylTanca = stylTanca;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }
    public String opisTancerza() {
        return "Tancerz :" + this.imie + " Kraj: " + this.kraj + " Wiek: " + this.wiek + " Styl: " + this.stylTanca + " " + "Ocena: " + this.ocena;
    }
}
