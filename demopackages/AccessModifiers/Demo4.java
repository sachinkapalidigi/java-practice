package mypack2;
import mypack1.Demo1;

// Subclass different package
public class Demo4 extends Demo1 {
    public void show(){
        // System.out.println(a); // Default not accesible
        // System.out.println(b); // private not accesible
        System.out.println(c);
        System.out.println(d);
    }
    
}
