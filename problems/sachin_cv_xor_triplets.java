public class Solution {
    
    long count(List<Integer> index) {
        int N = index.size();
        int last = index.get(N - 1);
        long C = 0;
        for(int i = N - 2; i >= 0; i--) {
            int d = last - index.get(i) - 1;
            C += d;
        }
        return C;
    }
    
    public int solve(int[] A) {
        Map<Integer, List<Integer>> track = new HashMap<>();
        List<Integer> index = new ArrayList<>();
        index.add(-1);
        track.put(0, index);
        int xor = 0;
        int N = A.length;
        long C = 0;
        for(int i = 0; i < N; i++) {
            xor ^= A[i];
            index = track.get(xor);
            if(index == null) {
                index = new ArrayList<>();
                track.put(xor, index);
            }
            index.add(i);
            
            C += count(index);
        }
        return (int)(C % 1000000007);
    }
}
