class Solve {
    static int x = 10;
    int y = 100;

    public static class Pair {
        void display(){
            System.out.println(" static inner class can only access static members like - " +x);
            // cannot access y, solution
        }
    }

    // not accessible outside this class - no actual use for the word static
    private static class Index {
        int m;
        int n;
        Index(int m, int n){
            this.m = m;
            this.m = n;
        }
    }

    public int solution(){
        Index mn = new Index(x, y);
        System.out.println(mn.m+" - private static class index - "+mn.n);
        return y;
    }
}

public class StaticInner {
    public static void main(String[] args){
        System.out.println("----static inner class example-----");

        Solve.Pair sp = new Solve.Pair();
        sp.display();

        Solve s = new Solve();
        s.solution();

    }
}
