class Solution {
    static long mod = 1000000007;

    public int countGoodNumbers(long n) {
        long ans = 1;

        long even = (n + 1) / 2;
        long odd = n / 2;

        ans = (ans * power(5, even)) % mod;
        ans = (ans * power(4, odd)) % mod;

        return (int) ans;
    }

    static long power(long n, long k) {
        if (k == 0) return 1;

        long res;

        if (k % 2 == 0)
            res = power((n * n) % mod, k / 2);
        else
            res = (n % mod) * power(n, k - 1) % mod;

        return res % mod;
    }
}