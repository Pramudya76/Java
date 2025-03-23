class Circle extends Shape {
    double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Radius : " + " Color : " + color + ", Filled : " + filled;
    }


}


class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Width : " + width + " Length : " + length;
    }



}


class Square extends Rectangle{
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        return "Side : " + width;
    }


}



public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());


        circle.setRadius(3.14);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());



        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());


        rectangle.setWidth(5);
        rectangle.setLength(10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());


        Square square = new Square();
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.toString());
        

        square.setSide(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.toString());
    }
    
}