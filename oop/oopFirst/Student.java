package oop.oopFirst;

public class Student {

    String name = "Gooner";
    double cgpa;
    int age;
    boolean isEnrolled;

    Student(String name,  int age, double cgpa, boolean isEnrolled){
        this.name = name;
        this.age = age;
        this.cgpa =  cgpa;
        this.isEnrolled = isEnrolled;
    }void study(){
        System.out.println(this.name + " is studying");
    }



    
    
}
