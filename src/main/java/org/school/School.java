package org.school;

import java.util.ArrayList;
import java.util.List;

public class School {
   public List<Student> students;
   public String name;

    School(String name) {
        this.students = new ArrayList<>();
        this.name = name;
    }

    public boolean isEnrolled(String studentName){
        for(Student student : this.students){
            String name1 = student.getName();
//            String andrzejToUpperCase = name1.toUpperCase();
//            String andrzejToUpperCase2 = studentName.toUpperCase();
            if(name1.equalsIgnoreCase(studentName)){
                // sprawdzaj czy AndRZej to też andRZej
                return true;
            }
        }
        return false;
    }

    public void addStudent(String studentName){
        Student student = new Student(studentName);
        this.students.add(student);
    }

}
