package oop.ReflectionAnnotation;
import java.lang.annotation.*;
import java.lang.reflect.*;

// ANNOTATION:
// Metadata attached to a program element.
// Reflection can read it at runtime.

// Makes the annotation available at runtime.
@Retention(RetentionPolicy.RUNTIME)

// This annotation can be applied only to methods.
@Target(ElementType.METHOD)
@interface important {
    String value(); // Annotation element that stores a message.
}

class student {

    @important("must be completed")
    public void study() {
        System.out.println("student is studying");
    }

    public void play() {
        System.out.println("student is playing");
    }
}

public class program {
    public static void main(String[] args) throws Exception {

        // REFLECTION:
        // Inspects and interacts with classes, methods,
        // fields, etc. at runtime.

        Class<?> c = student.class; // Represents the student class.
        student s = new student();

        // Gets methods declared directly inside student.
        for (Method m : c.getDeclaredMethods()) {

            // Checks whether the method has our annotation.
            if (m.isAnnotationPresent(important.class)) {

                // Reads the annotation and its stored value.
                important a = m.getAnnotation(important.class);

                System.out.println(m.getName());
                System.out.println(a.value());

                // Invokes the discovered method on object s.
                m.invoke(s);
            }
        }
    }
}

