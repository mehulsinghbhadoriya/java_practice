package oop.Inheritance;

public class Demo {

    public static void main(String[] args) {

        Student s =  new Student();
        Engstudent es = new Engstudent();

        es.attendlab();
        es.markattend(); // derived class object using the method of parent class
        s.markattend();
        // s.attenlab(); // This is invalid derived class can use any method of the parent class but parant class cannot use the method of its derived class
        
    }
    
}

class Student{
    String name;
    int age;

    void markattend(){
        System.out.println("Attendencae Marked");
    }
}

class Engstudent extends Student{

    void attendlab(){
        System.out.println("Lab attended");
    }

}
