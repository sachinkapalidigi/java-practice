
// 1. Abstraction
// 2. Encapsulation
// 3. Inheritence
// 4. Polymorphism

class Television {
    private int channel;
    private int volume;
    public void changeChannel(){
        // 
    }
    public void changeVolume(){
        // 
    }
}


// Circle, rectangle, cylinder, student, account, car , television

class Circle {
    public double radius;
    
    public double area(){
        // 
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    public int length;
    public int breadth;
    
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Cyclinder {
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double surfaceArea(){
        // perimeter of base * height
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        // area of base * height
        return Math.PI * radius * radius * height;
    }
}


class Student {
    public int rollno;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (m1+m2+m3)/(3f);
    }
}

class Account {
    public long accNo;
    public String name;
    public double balance;
    public double deposit(double amount){
        return amount;
    }
    public double withdraw(double amount){
        return amount;
    }
}

class Car {
    public String name;
    public String regNo;
    // public Color cal;
    public double fuelQty;

    public void start(){}

    public void stop(){}
    public void changeGear(){}
}

public class BasicPrinciples {
    public static void main(String[] args){
        Television t = new Television();
        Television t2 = new Television();

        t.changeChannel();
        t2.changeVolume();

        Circle c1 = new Circle();
        c1.radius = 7; 
        System.out.println("Area of Circle c1: ");
        System.out.println(c1.area());
        System.out.println("Perimeter of Circle c1: ");
        System.out.println(c1.perimeter());

        Student s1 = new Student();
        s1.name = "Sachin";
        s1.m1 = 100;
        s1.m2 = 99;
        s1.m3 = 99;
        System.out.println("Student s1: total and average");
        System.out.println(s1.total());
        System.out.println(s1.average());
    }
}
