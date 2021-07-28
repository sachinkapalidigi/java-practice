import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        testCases();

    }   

    static void testCases(){
        int[] tcase1 = {3, 8, 6, 12, 10, 7};
        int[] tcase2 = {3, 7, 6, 12, 10, 7};
        qsort(tcase1, 0, tcase1.length-1);
        qsort(tcase2, 0, tcase2.length-1);
        System.out.println(Arrays.toString(tcase1));
        System.out.println(Arrays.toString(tcase2));

    }

    static void qsort(int[] arr, int l, int r){
        if(l>=r) return;

        int pivot = naivePartition(arr, l, r);
        qsort(arr, l, pivot-1);
        qsort(arr, pivot+1, r);
        return;
    }

    static int naivePartition(int[] arr, int l, int r){
        // my naive partition
        int pivot = arr[r];
        int count = 0;
        for(int i=l;i<r; i++){
            if(arr[i]<=pivot) count++;
        }
        int pivInd = count+l;
        swap(arr, pivInd, r);
        int i=l;
        int j=pivInd+1;
        while (i<pivInd && j<=r) {
            
            if(arr[i]>=pivot && arr[j]<pivot){
                swap(arr, i, j);
                i++;
                j++;
            }else {
                if(arr[i]>=pivot){
                    j++;
                }else if(arr[j]<pivot){
                    i++;
                }else {
                    i++; j++;
                }
            }
        }
        return pivInd;
    }

    static void swap(int[] arr, int i, int j){
        // arr[i] ^= arr[j];
        // arr[j] ^= arr[i];
        // arr[i] ^= arr[j];
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
