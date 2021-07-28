

class NegativeDimensionException extends Exception {
    // override getmessage or tostring method
    @Override
    public String getMessage(){
        return "Dimensions cannot be less than 0";
    }
}

public class Throws {

    static int area(int l, int b) throws Exception {
        if(l<0 || b<0) {
            // throw new Exception("Dimensions cannot be 0");
            throw new NegativeDimensionException();
        }
        return l*b;
    }

    static void meth1(){
        try { // if you dont use try catch , you have to use throws Exception on all the blocks
            int a = area(5, -10);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        meth1();
    }    
}
