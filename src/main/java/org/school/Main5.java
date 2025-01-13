package org.school;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        Student student1= new Student ( "Andrzej");
        Student student2= new Student ("Michael");
        List<Student> studentsOldSchool= new ArrayList<>();
        List<Student> studentsNewSchool = new ArrayList<>();
        studentsOldSchool.add(student1);
        studentsNewSchool.add(student2);

        School school1 = new School(studentsOldSchool,"SchoolkNr1");
        School school2 = new School(studentsNewSchool,"SchoolkNr2");
        boolean isStudentAvailable = school1.isEnrolled("Andrzej");
        boolean isStudentAvailable2 = school2.isEnrolled("Michael");
        System.out.println(isStudentAvailable);
        System.out.println(isStudentAvailable2);
    }
}
