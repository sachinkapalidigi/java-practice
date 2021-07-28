import java.util.*;


/**
 * Exp
 */
public class Exp {

    public static void main(String[] args){
        HashSet<ArrayList<Integer>> s = new HashSet<ArrayList<Integer>>();

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);

        s.add(a);

        // System.out.println(s);

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(3);

        s.add(b);

        System.out.println(s);
    }
}