package org.school;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        Student student1= new Student ( "Andrzej");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        System.out.println(students);
        School school = new School(students);
        boolean isStudentAvailable = school.isEnrolled("Andrzej");
        System.out.println(isStudentAvailable);
    }
}
