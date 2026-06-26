class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int current = 1;
        int prev = 0;
        for(int i=2;i<=n;i++){
            int sum = prev + current;
            prev = current;
            current = sum;
        }
        return current;
    }
}