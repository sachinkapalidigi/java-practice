

class StaticBlockExample {
    static int a;
    int b;

    static {
        System.out.println("example block 1");
        a = 10;
    }

    static {
        System.out.println("example block 2");
        a = 100;
    }

    public void display(){
        System.out.println("displaying example block");
    }
}


public class StaticBlock {
    static int a;
    int b;

    static {
        System.out.println("block 1");
        a = 10;
    }

    static {
        System.out.println("block 2");
        a = 100;
    }

    public static void main(String[] args){
        // 
        System.out.println(a + " a is printed"); 

        // StaticBlockExample ex = new StaticBlockExample();
        // ex.display();
    }

}
