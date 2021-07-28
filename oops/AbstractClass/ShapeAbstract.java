abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape {
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double perimeter(){

        return 2*Math.PI*radius;
    }

    @Override
    public double area(){

        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double breadth;
    Rectangle(double length, double breadth ){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter(){

        return 2*(length+breadth);
    }

    @Override
    public double area(){

        return length*breadth;
    }
}

public class ShapeAbstract {
    
}
