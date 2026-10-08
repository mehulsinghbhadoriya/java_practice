package oop.abstraction;

public class Demo {

    public static void main(String[] args) {

        Car fc = new FuelCar();
        Car ec = new ElectricCar();
        ElectricCar e1 = new ElectricCar();

        e1.repair();
        fc.start();
        fc.brake();
        fc.accelerate();

        ec.start();
        ec.brake();
        ec.accelerate();

        
    }

   
    
}
 abstract  class  Car{
        void start(){
            System.out.println("Car started");
        }

        abstract void accelerate();

        abstract void brake();
    }

    class FuelCar extends Car{
         
        @Override 
        void brake(){
            System.out.println("Fuel car is stopped");
        }
        @Override 

        void accelerate(){
            System.out.println("Fuel car is accelerated");
        }
    }

    class ElectricCar extends Car{
        @Override 
        void brake(){
            System.out.println("Electric car is stopped");
        }
        @Override 
        void accelerate(){
            System.out.println("Electric car is accelerated");
        }

        void repair(){
            System.out.println("The car is repaired");
        }
    }

