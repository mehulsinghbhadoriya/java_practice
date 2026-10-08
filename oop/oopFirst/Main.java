package oop.oopFirst;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("raj",12,8.5,false);
        Student student2 = new Student("sam",14,6.67,true);
        Student student3 = new Student("sandy", 16, 7.89, false);

        System.out.println(student1.name);
        System.out.println(student1.name);
        System.out.println(student1.isEnrolled);
        System.out.println(student1.cgpa);

        System.out.println(student3.name);
        System.out.println(student3.name);
        System.out.println(student3.isEnrolled);
        System.out.println(student3.cgpa);

        student1.study();
    }
    
}
