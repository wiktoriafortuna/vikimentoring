package org.example;

import java.util.List;

public class InfluencerEquipment {
    private List<Dom> domy;
    private Samochod samochod;
    public List<Telefon> kolekcja;
    public InstagramKonto instagramKonto;
    public int wiek;

    InfluencerEquipment(List<Dom> domy, Samochod samochod, List<Telefon> kolekcja, InstagramKonto instagramKonto, int wiek) {
        this.domy = domy;
        this.samochod = samochod;
        this.kolekcja = kolekcja;
        this.instagramKonto = instagramKonto;
        this.wiek= wiek;
    }

    public List<Dom> getDomy() {
        return domy;
    }

    public void setDomy(List<Dom> domy) {
        this.domy = domy;
    }


    public Samochod getSamochod() {
        return samochod;
    }

    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }

    public List<Telefon> getKolekcja() {
        return kolekcja;
    }

    public void setKolekcja(List<Telefon> kolekcja) {
        this.kolekcja = kolekcja;
    }

    public InstagramKonto getInstagramKonto() {
        return instagramKonto;
    }

    public void setInstagramKonto(InstagramKonto instagramKonto) {
        this.instagramKonto = instagramKonto;
    }

    public String opisInfluinsera() {
        return "mieszkam w domie o adresie: " + "\n" +
                domy.get(0).getAdres() +
                "\n" + domy.get(1).getAdres() +
                "\n" + domy.get(2).getAdres() + "\n" +
                " Powierzchnia: " + "\n" +
                domy.get(0).getPowierzchnia() + "\n" +
                domy.get(1).getPowierzchnia() + "\n" +
                domy.get(2).getPowierzchnia() + "\n" +
                " Posida samochod marki: " + samochod.getMarka() + "\n" +
                " Cena go: " + samochod.getCena() + "\n" +
                " Telefon modelu: " + "\n" +
                kolekcja.get(0).getModel() + "\n" +
                kolekcja.get(1).getModel() + "\n" +
                " Konto na instagramie: " + instagramKonto.getNazwaUzytkownika() +
                " Wiek : " + wiek + "\n";
    }


//    Domu (lokalizacja i wartość),
//    Samochodzie (marka i cena),
//    Telefonach w kolekcji (marka i cena każdego telefonu),
//    Koncie na Instagramie (nazwa i liczba obserwujących).

}
