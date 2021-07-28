import java.util.*;


/**
 * Combinations
 */
public class Combinations {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args){
        // int[] arr = {1, 2, 3, 4};
        int index = 0;
        // int[] curr = new int[3];
        // generate(curr, index, arr);
        res = new ArrayList<ArrayList<Integer>>();
        int[] curr_comb = new int[3];
        generateCombinations(curr_comb, index, 5);
        System.out.println(res);
        // int[] curr_bin = new int[4];
        // generateBinary(curr_bin, index);
    }


    static void generate(int[] curr, int index, int[] arr){
        if(curr.length == index){
            System.out.println(Arrays.toString(curr));
            
            return;
        }

        for(int i=0; i<arr.length; i++){
            curr[index] = arr[i];
            generate(curr, index+1, arr);
        }
        return;
    }

    static void generateBinary(int[] curr, int index){
        if(curr.length == index){
            System.out.println(Arrays.toString(curr));
            return;
        }


        curr[index] = 0;
        generateBinary(curr, index+1);

        curr[index] = 1;
        generateBinary(curr, index+1);
        return;
    }

    static void generateCombinations(int[] curr, int index, int A){
        if(curr.length == index){
            // System.out.println(Arrays.toString(curr));
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0; i<curr.length; i++) {
                arr.add(curr[i]);
            }
            res.add(arr);
            return;
        }

        for(int i=index; i<A; i++){
            if(index != 0 && curr[index-1] >= i+1){
                continue;
            }
            curr[index] = i+1;
            generateCombinations(curr, index+1, A);
        }
        return;
    }
}