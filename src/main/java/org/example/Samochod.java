package org.example;

public class Samochod {
    String marka;
    double cena;

    Samochod(String marka, double cena) {
        this.marka = marka;
        if(cena<=10000){
            System.out.println("Cena tego samochodu jest zbyt niska!");
            this.cena=10000;
        }else{
            System.out.println("Cena jest git");
            this.cena=cena;
        }
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena <= 0) {
            System.out.println("Cena musi być większa niż 0!");
        } else {
            this.cena = cena;
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}





