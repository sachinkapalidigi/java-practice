package mypack1;


// sublass of same packg
public class Demo3 extends Demo1{
    public void show(){
        System.out.println(a);
        // System.out.println(b); // private not accesible
        System.out.println(c);
        System.out.println(d);
    }
}
