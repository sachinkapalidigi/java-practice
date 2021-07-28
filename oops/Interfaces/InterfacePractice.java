
interface Test {
    void meth1();
    void meth2();
}

interface Test2 extends Test {
    void meth4();
}

class MyTest implements Test2{
    // over ride all methods to make this class non abstract

    public void meth1(){
        System.out.println("Meth1 of mytest class");
    }

    public void meth2(){
        System.out.println("Meth2 of mytest class");
    }

    public void meth3(){
        System.out.println("Meth3 of mytest class");
    }

    public void meth4(){
        System.out.println("Meth4 of Test 2 interface overrided in my test");
    }
}



public class InterfacePractice {
    public static void main(String[] args) {
        // possible ref of interface and 
        Test t = new MyTest();
        t.meth1();
        t.meth2();

        MyTest mt = new MyTest();
        mt.meth1();
        mt.meth2();
        mt.meth3();
        mt.meth4();
    }
}
