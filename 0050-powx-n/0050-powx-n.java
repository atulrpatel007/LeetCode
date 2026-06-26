class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        long nn = n;
        if (nn < 0) {
            nn = -nn;
        }

        double ans = 1;

        if (nn % 2 == 0) {
            ans = myPow(x * x, (int)(nn / 2));
        } else {
            ans = x * myPow(x, (int)(nn - 1));
        }

        if (n < 0) return 1.0 / ans;
        return ans;
    }
}