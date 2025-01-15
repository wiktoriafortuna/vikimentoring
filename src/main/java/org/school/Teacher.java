package org.school;

class Teacher {

    String name;
    Integer salary;
    String subject;

    public Teacher(String name, Integer salary, String subject) {
        this.name = name;
        this.salary = salary;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", subject='" + subject + '\'' +
                '}';
    }
}
