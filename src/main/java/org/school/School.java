package org.school;

import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Student> students;
    public List<Teacher> teachers;
    public List<Lesson> lessons;
    // nauczycieli np. Dr Andrzej, Prof. Angelika
    // zajecia/lekcje np. matematyka, fizyka, wf
    public String name;

    School(String name) {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.lessons = new ArrayList<>();
        this.name = name;
    }

    public boolean isEnrolled(String studentName) {
        for (Student student : this.students) {
            String name1 = student.getName();
            if (name1.equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        return false;
    }

    public void addStudent(String studentName) {
        Student student = new Student(studentName);
        this.students.add(student);
    }

}
