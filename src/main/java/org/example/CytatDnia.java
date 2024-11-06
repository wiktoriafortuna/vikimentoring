package org.example;

import java.util.LinkedList;
import java.util.Random;

public class CytatDnia {
    static String nana(String name) {
        String[] cytat = new String[4];
        cytat[0] = "Jestes cool";
        cytat[1] = "Bo ty jestes zajebista i ta sprawa oczywista";
        cytat[2] = "Wypij dodatkowej kawki i zycie sie polepszy";
        cytat[3] = "A nie myj tych garów dzis, wypij winko";

        Random generator = new Random();
        int losowyIndexElementu = generator.nextInt(4);

        return "Cześć " + name + ": Cytat dnia to:  " + cytat[losowyIndexElementu];
    }

    public static void main (String[]args){
        System.out.print(nana("Wiktoria"));
    }
}
