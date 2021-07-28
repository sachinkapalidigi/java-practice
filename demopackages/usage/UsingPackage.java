import mypack1.Demo;
import mypack1.inner.Demo3;

public class UsingPackage {
    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.display();
        Demo3 d3 = new Demo3();
        d3.display();
    }
}
