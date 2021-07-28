package checkedunchecked;
import java.io.*;

class LowBalanceException extends Exception {
    @Override
    public String toString(){
        return "Balance is below 5000 please recharge";
    }
}

public class CheckedUnchecked {
    static void func1(){
        try{
            System.out.println(10/0); // unchecked - exception , no compiler error
        }
        catch (Exception e){
            System.out.println("This try catch block is not required actually for compiling as it is an unchecked exception");
        }

        // This try catch is a must , without which it wont compile
        // Checked Exception
        try {
            FileInputStream fi = new FileInputStream("mytext.txt");
        } catch (Exception e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }

        // User defined exception
        try {
            throw new LowBalanceException();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static void fun2(){
        func1();
    }

    static void fun3(){
        fun2();
    }

    public static void main(String[] args){
        fun3();
    }
}
