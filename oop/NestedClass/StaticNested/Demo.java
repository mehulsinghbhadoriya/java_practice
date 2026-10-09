package oop.NestedClass.StaticNested;

public class Demo {

    public static void main(String[] args) {

        outer o = new outer();
        outer.inner i = new outer.inner(o);
        i.fun();
        
    }
     
}

class outer{
    public static int x = 2;
    int y = 4;

    public static class inner{

        outer o;
        inner(outer o){
            this.o = o;
        }

        void fun(){
            System.out.println(x);
            System.out.println(o.y);  // Static class cannot implement methods requiring variables that are not non static
        }

    }
}
