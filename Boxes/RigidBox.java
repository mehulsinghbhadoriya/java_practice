package Boxes;

public class RigidBox extends Box{
    private double thickness;

    public RigidBox(double length, double breadth, double height, double thickness) {
        super(length, breadth, height);
        this.thickness = thickness;
    }

    @Override 
    public double material(){
        return 1.5*thickness*super.material();
    }

    
    


    
}
