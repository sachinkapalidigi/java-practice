
abstract class Super {
    public Super(){
        System.out.println("Super Constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();
}


class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Meth 2 of sub class overriden");    
    }

    public void meth3(){
        System.out.println("Meth 3 of sub class");
    }
}

public class BasicAbstract {
    public static void main(String[] args) {
        Sub su = new Sub();
        su.meth1();
        su.meth2();
        su.meth3();

        Super sp = new Sub();
        sp.meth1();
        sp.meth2();
    }
}
