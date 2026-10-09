package oop.InterfaceTypes.Comparable;
import java.util.*;


// ============================================================
// comparable interface
// ============================================================
//
// comparable is a built-in java.lang interface used when a
// class wants to define its own "natural ordering".
//
// by implementing comparable<t>, the class must provide
// compareto(t other), which tells java how one object should
// be ordered relative to another:
//
// negative value → this object comes before other
// zero           → this object is equal in ordering to other
// positive value → this object comes after other
//
// the actual comparison logic is written by us inside compareto().
//
// this  = current object
// other = object being compared with the current object
//
// collections such as treeset can automatically use compareto()
// to sort objects and determine their ordering.
//
// ============================================================


class Student implements Comparable<Student> {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    // natural ordering:
    // students are sorted according to marks
    @Override
    public int compareTo(Student other) {

        // negative → this comes before other
        // zero     → same ordering
        // positive → this comes after other

        return this.marks - other.marks;
    }


    @Override
    public String toString() {
        return name + " : " + marks;
    }
}


class Program {

    public static void main(String[] args) {

        // treeset automatically keeps students sorted.
        // it uses compareTo() to decide the order.
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("Rahul", 70));
        students.add(new Student("Amit", 90));
        students.add(new Student("Neha", 80));
        students.add(new Student("Rohan", 60));


        // prints students according to their marks
        for (Student s : students) {
            System.out.println(s);
        }
    }
}