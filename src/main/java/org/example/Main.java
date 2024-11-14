package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tancerz tancerz1 = new Tancerz("Wiki", "Poland");
        Tancerz tancerz2 = new Tancerz("Wiki", "Poland", 18);
        Tancerz tancerz3 = new Tancerz("Wiki", "Poland", 18, "ludowe", 5);
        Tancerz[] tablica = new Tancerz[3];
        tablica[0] = tancerz1;
        tablica[1] = tancerz2;
        tablica[2] = tancerz3;
        for (int i = 0; i < tablica.length; ++i) {
            System.out.println(tablica[i].opisTancerza());
            }
        }
    }



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj ile samochodow tworzysz");
//        int ilosc = scanner.nextInt();
//        scanner.nextLine();
//
//        Samochod[]tablica=new Samochod[ilosc];
//        for (int i = 0; i < tablica.length; ++i) {
//            System.out.println("Podaj marke");
//            String marka = scanner.nextLine();
//
//            System.out.println("Podaj ceny");
//           Double ceny = scanner.nextDouble();
//           scanner.nextLine();
//
//
//            tablica[i] = new Samochod(marka,ceny);
//
//        }
//        for (int i = 0; i < tablica.length; ++i) {
//
//            System.out.println(tablica[i].getMarka()+" " + tablica[i].getCena());
//        }

//        Telefon telefon1 = new Telefon("Apple","13",2000);
//       Telefon telefon2 = new Telefon("Apple","14");
//       Telefon telefon3 = new Telefon("15",4000);
//        Telefon telefon4 = new Telefon();
//        Telefon telefon5 = new Telefon("Apple","13",3000," bialy",20);
//        Telefon[]tablica = new Telefon[5];
//        tablica[0] = telefon1;
//        tablica[1] = telefon2;
//        tablica[2] = telefon3;
//        tablica[3] = telefon4;
//        tablica[4] = telefon5;
//
//       for (int i = 0; i < tablica.length; ++i) {
//          System.out.println(tablica[i].opisTelefonu());
//       }
//       int i=1;
//       int j= ++i;
////       i = i+1;
//       int x= i+1;
//       System.out.println(j);
//       System.out.println(x);

















