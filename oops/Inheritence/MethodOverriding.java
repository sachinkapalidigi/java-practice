class Super {
    public void display(){
        System.out.println("Super class method");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class overrided method");
    }
}


class TV {
    protected void switchOn() {System.out.println("Tv is switched ON");}
    public void changeChannel() {System.out.println("Tv channel is changed");}
    public void switchToAV() {System.out.println("switch TV to av"); }
}

class SmartTV extends TV {
    @Override
    public void switchOn() {System.out.println("Smart tv is switched on");}

    @Override
    public void changeChannel(){System.out.println("Smart tv channel is changed");}

    public void browse(){System.out.println("Smart tv is browsed");}
}

public class MethodOverriding {
    public static void main(String[] args){
        Super sp = new Super();
        sp.display();

        Sub sb = new Sub();
        sb.display();

        Super ss = new Sub();
        ss.display();
        // --------------- TV ---------------

        TV t1 = new TV();
        t1.switchOn();
        t1.changeChannel();
        
        SmartTV t2 = new SmartTV();
        t2.switchOn();
        t2.changeChannel();
        t2.browse();

        // Dynamic Method Dispatch
        TV t3 = new SmartTV();
        t3.switchOn();
        t3.changeChannel();
        // t3.browse(); // cannot be called as reference is tv - only overriden methods + methods from super can be called
        t3.switchToAV(); // can be called
    }
}
