package mypack1;

// same package non sub class
public class Demo2 {
    Demo1 d = new Demo1();
    public void show(){
        System.out.println(d.a);
        // System.out.println(d.b); // private not accesible
        System.out.println(d.c);
        System.out.println(d.d);
    }
}
