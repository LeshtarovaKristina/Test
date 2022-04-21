package Class27;
/*
Create an Interface 'Shape' with undefined methods
as calculateArea and calculatePerimiter. Create 2
classes Circle & Square that implements functionality
defined in the Shape Interface. Test your code.
*/

interface Shape{
    void calculateArea(double input);
    void calculatePerimiter(double input);
}

class Circle implements Shape{

    @Override
    public void calculateArea(double input) {

        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimiter(double input) {
        System.out.println(2*Math.PI*input);

    }
}
class Square implements Shape{
    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimiter(double input) {
        double perimeter=4*input;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Shape shape=new Square();
        shape.calculatePerimiter(10);

    }
}