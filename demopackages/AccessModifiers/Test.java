import mypack1.Demo1;

public class Test {
    private static int mod = 1_000_000_007;
    public static void main(String[] args){

        Demo1 d1 = new Demo1();

        d1.display();
        System.out.println(d1.d); // only public is accesible outside the package

        System.out.println( power(12, mod-2) );

    }

    public static long power(long base, long pow){
        if(base == 1 || pow == 0) return 1;
        if(pow == 1) return base;
        
        if(base%2 == 0) return (power(base, pow/2)%mod * power(base, pow/2)%mod)%mod;
        return (base%mod * power(base, pow/2)%mod * power(base, pow/2)%mod)%mod;
    }
}
