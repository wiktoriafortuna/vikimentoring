package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Dom dom = new Dom("Krakow", 10000, 4);
        Dom dom1 = new Dom("Hiszpania", 30000, 2);
        Dom dom2 = new Dom("Poznan", 2000, 8);
        Samochod samochod = new Samochod("bmw", 1000000);
        Telefon telefon1= new Telefon("Apple", 20000);
        Telefon telefon2= new Telefon("Banana", 20000);
        InstagramKonto instagramKonto = new InstagramKonto("VFA", 20000);

        List<Dom>domy =new ArrayList<>();
        domy.add(dom);
        domy.add(dom1);
        domy.add(dom2);

        List<Telefon> kolekcja = new ArrayList<>();
        kolekcja.add(telefon1);
        kolekcja.add(telefon2);
        int wiek =11;
        InfluencerEquipment influencer  = new InfluencerEquipment(domy, samochod, kolekcja, instagramKonto , wiek);

        System.out.print(influencer.opisInfluinsera() );

//
//        dopisz opis influencera = czyli dorobic metode w tej klsie influencerequ
////        za pomoca kolekcij
//
//        ten influencer moze miec 2 telefony ,


    }

}