package org.school;

import java.util.List;

public class School {
   public List<Student> students;
   public String name;

    School(List<Student>students, String name) {
        this.students = students;
        this.name = name;
    }

    public boolean isEnrolled(String studentName){
        for(Student student : students){
            if(student.getName().equals(studentName)){
                return true;
            }
        }
        return false;
    }

}
