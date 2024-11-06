package org.example;

public class Telefon {
    private String marka;
    private String model;
    private double cena;
    private Integer ekran;
    private boolean antene;
    private String kolor;
    private double pojemnoscBaterii;

    Telefon(String marka, String model, double cena) {
        this.marka = marka;
        this.model = model;
        this.cena = cena;
        System.out.println("uzyto konstruktor 1");

    }

    Telefon(String marka, String model) {
        this.marka = marka;
        this.model = model;
        this.cena=200;
        System.out.println("uzyto konstruktor 2");
        System.out.println("nie podales cene wiec domyslna" +this.cena );



    }
    Telefon(String model, double cena) {
        this.model = model;
        this.cena = cena;
        System.out.println("uzyto konstruktor 3");

    }
    Telefon() {
        this.cena=500;
        System.out.println("uzyto konstruktor 4");

    }
    Telefon(String marka, String model, double cena,String kolor, double pojemnoscBaterii) {
        this.marka=marka;
        this.model=model;
        this.cena=cena;
        this.kolor=kolor;
        this.pojemnoscBaterii=pojemnoscBaterii;
        System.out.println("Użyto konstruktor z kolorem i baterią");
}

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.equals("Galxy S21") || model.equals("iPhone 12") || model.equals("Mi 11")) {
            this.model = model;
        } else {
            System.out.println("Nieznany model!");

        }
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena <= 1000) {
            System.out.println("Cena nie może być mniejsza niż 1000 zł");
        } else {
            this.cena = cena;

        }
    }
    public Integer getEkran() {
        return ekran;
    }
    public boolean isantene() {
        return antene;
    }

    public String opisTelefonu() {
        return "Telefon:" + this.marka + "Model: " + this.model + "Cena: " + this.cena + "Kolor: " + this.kolor + "Pojemnosc: " + this.pojemnoscBaterii + " mAh";

    }
}






