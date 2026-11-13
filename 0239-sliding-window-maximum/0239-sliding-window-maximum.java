class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {int[] res = new int[nums.length - k + 1];
                int j = 0;
                Deque<Integer> q = new ArrayDeque<>();
                for (int i = 0; i < nums.length; i++) {
                    while (!q.isEmpty() && q.peekFirst() <= i - k) {
                        q.pollFirst();
                    }
                    while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                        q.pollLast();
                    }
                    q.addLast(i);
                    if (i >= k - 1) {
                        res[j++] = nums[q.peekFirst()];
                    }
                }
                return res;
    }
}