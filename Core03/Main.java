package Core03;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 4 , 3);
        Circle circle = new Circle(5, 5.5);
        rectangle.calculatePerimeter();
        System.out.println("Переметр прямукутника = "+ rectangle.calculatePerimeter());
        rectangle.calculateSquare();
        System.out.println("Площа прямокутника = " + rectangle.calculateSquare());
        circle.calculateSquare();
        System.out.println("Площа кола = " + circle.calculateSquare());
        circle.calculateLength();
        System.out.println("Довжина кола = " + circle.calculateLength());
    }

}
