
class FinalExample {
    final int MIN=1;
    static final int MAX;
    final int NORMAL;

    static {
        MAX = 100; // only static vars can be accessed 
    }

    FinalExample(){
        NORMAL = 50;
        // MAX = 100; cannot do this - it must be initialised in a static block as it is static variable
    }
}

class SuperMethodFinal {
    final int method1(){
        System.out.println("final method 1 in super method final class");
        return 500;
    }
}

class SubMethodFinal extends SuperMethodFinal {
    // cannot override method1

    int method2() {
        System.out.println("method 2 in sub method final");
        return 5;
    }
}

// cannot inherit super class but can use it
final class SuperClass {
    void display(){
        System.out.println("display for super class");
    }
}

public class FinalPractice {
    public static void main(String[] args){
        System.out.println(FinalExample.MAX+" max of final example");

        SubMethodFinal smf = new SubMethodFinal();
        smf.method1();
        smf.method2();

        SuperClass sc = new SuperClass();
        sc.display();
    }
}
