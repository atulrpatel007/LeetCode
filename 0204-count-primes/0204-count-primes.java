import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

   
        for (int i = 2; i * i < n; i++) {
        
            if (!isNotPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }

        return count;
    }
}