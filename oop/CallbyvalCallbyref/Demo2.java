// Call by reference -----> There is no call by reference in Java.
package oop.CallbyvalCallbyref;

class Demo2 {

    public static void main(String[] args) {

        Random r1 = new Random(4, 5);

        System.out.println(r1.x + ", " + r1.y);

        addten(r1);

        System.out.println(r1.x + ", " + r1.y);
    }

    static void addten(Random r) {
        r.x = r.x + 10;
        r.y = r.y + 10;
    }

    static class Random {
        int x;
        int y;

        Random(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}