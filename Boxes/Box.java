package Boxes;

public class Box {

    private double length;
    private double breadth;
    private double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

   public double material() {
        return 2 * (length * breadth + breadth * height + height * length) * 0.03;
    }

    public double capacity() {
        return length * breadth * height;
    }

    public double diagonal() {
        return Math.sqrt(length * length + breadth * breadth + height * height);
    }
    

    
    
}
