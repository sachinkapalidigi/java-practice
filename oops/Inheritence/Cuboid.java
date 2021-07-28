

class Rectangle{
    protected int length;
    protected int breadth;
    int x = 10;
    Rectangle(){
        length=breadth=1;
    }
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return this.length;
    }
    public int getBreadth(){
        return this.breadth;
    }
}


public class Cuboid extends Rectangle {
    private int height;
    int x = 20;
    Cuboid(){
        height = 1;
    }
    Cuboid(int height){
        this.height = height;
    }
    Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public int volume(){ 
        return length*breadth*height;
    }

    public void display(){
        System.out.println("super.x + x + this.x: ");
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args){
        System.out.println("Empty cuboid: ");
        Cuboid c1 = new Cuboid();
        System.out.println("Volume of no params: "+c1.volume());

        System.out.println("One Param cuboid: ");
        Cuboid c2 = new Cuboid(5);
        System.out.println("Volume: "+c2.volume());

        System.out.println("All Param cuboid: ");
        Cuboid c3 = new Cuboid(2, 3, 5);
        System.out.println("Volume: "+c3.volume());

        c3.display();

    }

}

