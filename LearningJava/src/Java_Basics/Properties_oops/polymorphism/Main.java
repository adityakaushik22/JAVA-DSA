package Java_Basics.Properties_oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area(); // override the parent function area and will call its own area function because circle has both area() from its own and shape class but in this it will prioritize itself and will override the parent area() function. hence circle area will be called.
    }
}
