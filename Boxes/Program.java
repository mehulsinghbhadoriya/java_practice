
package Boxes;

public class Program {

    static double buyboxes(Box each, int count) {
        double rate = count > 5 ? 0.085 : 0.095;
        return count * rate * each.material();
    }

    public static void main(String[] args) {

        Box b1 = new Box(23, 34, 45);
        RigidBox r1 = new RigidBox(12, 24, 11, 5);

        int count = Integer.parseInt(args[0]);

        System.out.println("total payment for light-weight box = "
                + buyboxes(b1, count));

        System.out.println("warehousing cost for light-weight box = "
                + (0.002 * count * b1.capacity()));

        System.out.println("total payment for heavy-weight box = "
                + buyboxes(r1, count));

        System.out.println("warehousing cost for heavy-weight box = "
                + (0.002 * count * r1.capacity()));
    }
}