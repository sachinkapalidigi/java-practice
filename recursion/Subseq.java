import java.util.*;


/**
 * Subseq
 */
public class Subseq {

    public static void main(String[] args){
        int[] A = {1, 1000, 55, 944, 20};
        // count all non empty subsequences of A where sum is <= 1000 and length of subseq = B;
        int B = 3;
        System.out.println(subseqsum(A, B, 0, 0, 0));
    }

    static int subseqsum(int[] A, int B, int sum, int count, int i){
        if(i == A.length){
            if (B == count && sum<=1000) {
                return 1;
            }
            return 0;
        }


        return subseqsum(A, B, sum+A[i], count+1, i+1) + subseqsum(A, B, sum, count, i+1);
    }


}