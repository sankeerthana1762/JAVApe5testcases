package com.stackrote.junit;

import java.util.Comparator;

public class StudentClass {
    private int id;
    private String name;
    private int age;

    public StudentClass(int id,String name,int age){

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class StudentSorter implements Comparator<StudentClass> {
    @Override
    public int compare(StudentClass a, StudentClass b) {
        if (a.getAge() == (b.getAge())) {
            if (a.getName().equals(b.getName())) {
                return a.getId() - b.getId();
            } else {
                return a.getName().compareTo(b.getName());
            }

        } else {
            return a.getAge() - b.getAge();
        }
    }
}