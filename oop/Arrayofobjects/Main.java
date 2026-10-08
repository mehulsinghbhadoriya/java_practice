package oop.Arrayofobjects;

public class Main {
    public static void main(String[] args) {
        // Car car1 = new Car("porche","brown");
        // Car car2 = new Car("volkswagen","Black");
        // Car car3 = new Car("charger","yellow");

        // Car[] cars = {car1, car2, car3};

        //Below are examples of anonymous objects because they do not have a an identifier like car1 car2 etc.
        Car[] cars = {new Car("mustang", "red"),new Car("corvette","Blue"),new Car("honda","green") };


        // for(int i = 0;i<cars.length; ++i){
        //     cars[i].drive();
        // }

        for(Car car: cars){
            car.colour = "violet";
        }
        //enhanced for loop
        for(Car car: cars){
            car.drive();
        }

    }
    
}
