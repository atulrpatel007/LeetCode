class MyQueue {
    Queue<Integer> q1 = new ArrayDeque<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int peek() {
        return q1.element();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */