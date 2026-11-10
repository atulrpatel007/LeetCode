class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                list.push(asteroids[i]);
            }
            else {
                while (!list.isEmpty() && list.peek() > 0 && list.peek() < Math.abs(asteroids[i])) {
                    list.pop();
                }
                if(!list.isEmpty() && list.peek() == Math.abs(asteroids[i])){
                    list.pop();
                } else if (list.isEmpty() || list.peek() < 0) {
                    list.push(asteroids[i]);
                }
            }
        }
        int [] ans = new int[list.size()];
        while (!list.isEmpty()) {
            ans[list.size()-1] = list.pop();
        }
        return ans;
    }
}