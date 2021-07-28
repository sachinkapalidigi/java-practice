

class RightTriangle {
    private int base;
    private int height;
    
    // constructor
    public RightTriangle(){
        base = 0;
        height = 0;
    }
    // ------------ constructer 2 - method overloading
    public RightTriangle(int base, int height){
        if(base>0)this.base = base; // or make setBase static and call it
        if(height>0)this.height = height; 
    }

    public void setBase(int base){
        if(base>0) this.base = base;
    }
    public void setHeight(int height){
        if(height>0) this.height = height;
    }
    public int getBase() {
        return this.base;
    }
    public int getHeight(){
        return this.height;
    }
    public int getArea(){
        return this.base * this.height / 2;
    }
    public double getHyPotenuse(){
        return Math.sqrt(this.base*this.base + this.height*this.height);
    }
}



public class DataHiding {

    public static void main(String[] args){
        RightTriangle tri = new RightTriangle();
        tri.setBase(8);
        tri.setHeight(6);

        System.out.println("Right triangle tri Area: ");
        System.out.println(tri.getArea());
        System.out.println("Hypotenuse of tri: ");
        System.out.println(tri.getHyPotenuse());

        RightTriangle tri2 = new RightTriangle(5, 5);
        System.out.println("Right triangle tri2 Area: ");
        System.out.println(tri2.getArea());
        System.out.println("Hypotenuse of tri2: ");
        System.out.println(tri2.getHyPotenuse());
    }
    
}
