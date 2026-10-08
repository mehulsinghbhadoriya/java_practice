package oop.OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        /**overloaded constructors = allow a class to have multiple construcutors with different parameter lists.
         * enable objects to be initialized in various ways.
         * when you call the construcutor  to initialize values of object only that constructors would get called whose parameter contains the exact set of arguments you are passing.
         */

        User user1 =  new User("Max","max@gmail.com");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        User user2 =  new User("volk");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        User user3 =  new User("alex","alex@gmail.com",45);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        User user4 = new User();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

        
    }
    
}
