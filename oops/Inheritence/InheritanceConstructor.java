

class Parent {
    Parent(){
        System.out.println("Non - parameterised constructor");
    }
    Parent(int x){
        System.out.println("Param of Parent: "+x);
    }
}

class Child extends Parent {
    Child(){
        System.out.println("Non param of Child");
    }
    Child(int y){
        System.out.println("Param of Child");
    }
    Child(int x, int y){
        super(x);
        System.out.println("2 Param of child: "+y);
    }
}


public class InheritanceConstructor {
    public static void main(String[] args) {
        
        System.out.println("Child C1 is called: no params");
        Child c1 = new Child();

        System.out.println("Child c2 is called: 1 param");
        Child c2 = new Child(2);

        System.out.println("Child c3 is called: 2 params");
        Child c3 = new Child(3, 4);

    }    
}
