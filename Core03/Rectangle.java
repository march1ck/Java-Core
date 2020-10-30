package Core03;

public class Rectangle{

    private int width;

    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.width = 5;
        this.length = 3;
    }
    public int calculatePerimeter() {
        return (width + length)*2;
    }
    public int calculateSquare(){
        return width*length;
    }
}
