
public class LocalInner {
    public static void main(String[] args){
        
        LocalInner li = new LocalInner();
        li.callDisplay();

    }   

    void callDisplay(){
        display(); // this can be done, but cannot call methods like this from static classes without creating Object
    }
    
    void display(){

        class Inner {
            void innerDisplay(){
                System.out.println("Local inner class display");
            }
        }

        // instantiated only here
        Inner i = new Inner();
        i.innerDisplay();
    }   
}
