class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            min = value;
            stack.push((long) value);
        } else if (value >= min) {
            stack.push((long) value);
        } else {
            stack.push(2L * value - min);
            min = value;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long value = stack.pop();

        if (value < min) {
            min = 2 * min - value;
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;

        long top = stack.peek();

        if (top >= min) {
            return (int) top;
        }

        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}