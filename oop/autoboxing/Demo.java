package oop.autoboxing;

public class Demo {

    public static void main(String[] args) {
        //Autoboxing

        int x = 10;
        // Integer y = x; // autoboxing
        Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y); // unboxing


        //Unboxing

        Integer a = new Integer(20); // Old java method
        int b = a;
    }
    
}
