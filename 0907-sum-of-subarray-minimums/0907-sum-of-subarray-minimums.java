import java.util.Stack;

class Solution {
    private static final int MOD = 1000000007;

    public int sumSubarrayMins(int[] arr) {
        long sum = 0;

        int[] nse = NSE(arr);
        int[] psee = PSEE(arr);

        for (int i = 0; i < arr.length; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;

            long contribution = (left * right) % MOD;
            contribution = (contribution * arr[i]) % MOD;

            sum = (sum + contribution) % MOD;
        }

        return (int) sum;
    }

    static int[] NSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return res;
    }

    static int[] PSEE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return res;
    }
}