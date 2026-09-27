package oop.final_keyword;

public class Demo {

    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);
        
        final int x = 34;
        System.out.println(x);
        
        
    }
    
}

class Random{
    final double PI;
    Random(){
        this.PI = 3.14;
    }
}
