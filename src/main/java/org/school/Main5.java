package org.school;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        School school1 = new School( "SchoolkNr1");
        school1.addStudent("Andrzej");
        school1.addStudent("ANNA");
        school1.addStudent("Mieszko");
        school1.addStudent("Paweł");

        School school2 = new School( "SchoolkNr2");
        school2.addStudent("Michael");
        school2.addStudent("Wiktoria");

        boolean isStudentAvailable = school1.isEnrolled("andrzej");
        boolean isStudentAvailable2 = school2.isEnrolled("Michael");
        boolean isStudentAvailable3 = school1.isEnrolled("andrZeJ");
        System.out.println(isStudentAvailable);
        System.out.println(isStudentAvailable2);
        System.out.println(isStudentAvailable3);



    }
}
