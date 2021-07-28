import java.util.*;

/**
 * Zalgo
 */
public class Zalgo {

    public static void main(String[] args){
        // 
        zalgoTestCases();
    }

    static void zalgoTestCases(){
        String str = "aabxaabxcaabxaabxay";
        int[] strZ = calculateZ(str);
        System.out.println(Arrays.toString(strZ));


    }

    static int[] calculateZ(String str){
        int n = str.length();
        int[] z = new int[n];

        int l = 0;
        int r = 0;

        for(int i=1; i<n; i++) {

            if(i>r){
                l = r = i;
                while(r<n && str.charAt(r) == str.charAt(r-l)){
                    r++;
                }
                z[i] = r - l;
                r--;
            }else {
                int i1 = i - l;
                if(z[i1]+i <= r){
                    z[i] = z[i1];
                }else {
                    l = i;
                    while(r<n && str.charAt(r) == str.charAt(r-l)){
                        r++;
                    }
                    z[i] = r - l;
                    r--;
                }

            }

        }

        return z;
    }
}