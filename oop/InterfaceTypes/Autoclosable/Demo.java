package oop.InterfaceTypes.Autoclosable;


// AutoCloseable is a Java interface used for objects that need
// to release or clean up resources after they are no longer needed.
//
// A class implementing AutoCloseable must provide a close() method.
// When the object is used with try-with-resources, Java automatically
// calls close() when the try block finishes.
//
// Important:
// close() releases resources; it does NOT deallocate the object's memory.

public class Demo {

    public static void main(String[] args) {

        // try-with-resources automatically calls db.close()
        // when the try block finishes.
        try (DatabaseConnection db = new DatabaseConnection()) {

            db.fetchdata();

        } // close() is automatically called here
    }
}


// This class implements AutoCloseable, so it can be used
// inside try-with-resources.
class DatabaseConnection implements AutoCloseable {

    // Constructor
    public DatabaseConnection() {
        System.out.println("Connection established");
    }

    // Method used to perform some work with the resource
    public void fetchdata() {
        System.out.println("Fetching data from Database");
    }

    // AutoCloseable requires a close() method.
    // This method is automatically called by try-with-resources.
    @Override
    public void close() {
        System.out.println("Connection is closed");
    }
}