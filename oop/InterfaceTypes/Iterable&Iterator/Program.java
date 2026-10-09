import java.util.Iterator;

// Iterable: allows an object to provide an Iterator for traversing its elements.
class NumberList implements Iterable<Integer> {

private int[] numbers = {10, 20, 30, 40};

// iterator() returns an Iterator that traverses the elements.
@Override
public Iterator<Integer> iterator() {

    // Anonymous inner class implementing the Iterator interface.
    return new Iterator<Integer>() {
        private int index = 0;

        // Returns true if another element is available.
        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        // Returns the next element and advances the position.
        @Override
        public Integer next() {
            return numbers[index++];
        }
    };
}

}

public class Program {
public static void main(String[] args) {

    NumberList list = new NumberList();

    // Using Iterator directly.
    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
        System.out.println(it.next());
    }

    System.out.println("--- for-each loop ---");

    // Iterable makes the object usable in a for-each loop.
    for (int n : list) {
        System.out.println(n);
    }
}

}