class MinStack {
    private Deque<Integer> minValues;
    private Deque<Integer> stack;

    public MinStack() {
        minValues = new ArrayDeque<>();
        stack = new ArrayDeque<>();
    }

    public void push(int val) {
        if (minValues.isEmpty()) {
            minValues.addFirst(val);
        } else {
            int min = Math.min(val, minValues.peekFirst());
            minValues.addFirst(min);
        }

        stack.addFirst(val);
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        minValues.removeFirst();
        stack.removeFirst();
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return minValues.peekFirst();
    }
}
