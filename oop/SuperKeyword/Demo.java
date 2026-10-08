package oop.SuperKeyword;

public class Demo {

    public static void main(String[] args) {
        Engstudent es =  new Engstudent("Karthik", 45, 34,"SVVV");
        es.name = "Mehul";
        es.age = 23;
        es.rollno = 34;
        es.college = "MET IIT";

        es.print();

        

    }
    
}

class Student{
    String name;
    int age;
    int rollno;

    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    void print(){
        System.out.println(name + " , " + age + " , " + rollno);
    }
}

class Engstudent extends Student{
    String college;
    int x;

    Engstudent(String name, int age, int rollno, String college){
         super(name,age,rollno);
        this.college = college;
    }
   

    void print(){
        super.print();
        System.out.println(college);
    }
}
