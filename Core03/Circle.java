package Core03;

public class Circle {

    private int radius ;

    private double diameter;

    public Circle(int radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double calculateSquare(){
        return (3.14)* diameter * diameter;
    }
    public double calculateLength(){
        return 2 * (3.14)* radius;
    }

}
