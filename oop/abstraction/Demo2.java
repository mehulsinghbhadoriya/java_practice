package oop.abstraction;

public class Demo2 {

    public static void main(String[] args) {
        Car fc = new FuelCar();
        fc.start();
        fc.accelerate();
        fc.brake();
        
    }
    
}

interface Car{
    void start();

    void accelerate();

    void brake();
}


    class FuelCar implements Car{

        public void start(){
            System.out.println("Car started");
        }
         
        @Override 
        public void brake(){
            System.out.println("Fuel car is stopped");
        }
        @Override 

        public void accelerate(){
            System.out.println("Fuel car is accelerated");
        }
    }

    class ElectricCar implements Car{

        public void start(){
            System.out.println("Car started");
        }

        @Override 
        public void brake(){
            System.out.println("Electric car is stopped");
        }
        @Override 
        public void accelerate(){
            System.out.println("Electric car is accelerated");
        }
    }
