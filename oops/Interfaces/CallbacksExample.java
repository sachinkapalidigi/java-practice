
interface Member {
    final static boolean HAS_MONEY = true;
    final static int MinAmount = 100;
    // bu default static and final
    int maxamount = 1000; // dont use lower case
    void callback();

    public static void pay(){
        System.out.println("Pay by member");
    }

    private void privateMethod(){
        System.out.println("Can be called only in default methods");
    }

    default void deafultMethod(){
        System.out.println("default method of interface");
        privateMethod();
    }


}

class Customer implements Member {
    private String name;
    Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public void callback(){
        System.out.println("Calling cusomer "+this.name);
    }
}

class Store {
    private Member[] members = new Member[100];
    private int count = 0;
    void register(Member m){
        if(count == 100) return;
        members[count++] = m;
    }
    void inviteSale(){
        for(int i=0; i<count; i++){
            members[i].callback();
        }
    }
}

public class CallbacksExample {
    public static void main(String[] args){
        Store kapali = new Store();
        Customer c1 = new Customer("Sachin");
        Customer c2 = new Customer("Suranjan");
        kapali.register(c1);
        kapali.register(c2);

        kapali.inviteSale();

        System.out.println(Member.maxamount); // possible but donot use lower case
        Member.pay(); // static method of interface

        c1.deafultMethod(); // default methods can be called only using objects
    }
}
