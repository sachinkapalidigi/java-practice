public class FinallyDemo {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(5/0);

        }
        finally {
            System.out.println("Final Message");
        }
        // catch is not there but method throws Exception , hence it is passed to JVM and JVM catches and prints the exception
    }
}
