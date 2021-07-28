public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        ed.basicExceptionHandling();
        ed.multipleExceptionHandling();
    }

    void basicExceptionHandling(){
        int a, b, c;
        try {
            a = 5;
            b = 0;
            c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("End of basic exception handling");
    }

    void multipleExceptionHandling(){
        int[] A = {10, 20, 30, 0};
        int r ;
        try {
            r = A[1]/A[3];
            // it doesnt go beyond this point
            System.out.println(A[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } finally {
            System.out.println("finally runs");
        }
        System.out.println("End of multiple exception handling");
    }

}
