package org.example;

import java.util.List;

public class InfluencerEquipment {
    private Dom dom;
    private Samochod samochod;
    public  List<Telefon>kolekcja;
    public InstagramKonto instagramKonto;

    InfluencerEquipment(Dom dom, Samochod samochod, List<Telefon> kolekcja, InstagramKonto instagramKonto) {
        this.dom = dom;
        this.samochod = samochod;
        this.kolekcja= kolekcja;
        this.instagramKonto = instagramKonto;
    }

    public Dom getDom() {
        return dom;
    }

    public void setDom(Dom dom) {
        this.dom = dom;
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
}
