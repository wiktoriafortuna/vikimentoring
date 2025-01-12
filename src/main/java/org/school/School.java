package org.school;

import java.util.List;

public class School {
    List<Student> students;

    School(List<Student>students){
        this.students = students;
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
