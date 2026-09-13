import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        // Step 1: Add the new element to the back of the queue
        queue.add(x);
        
        // Step 2: Rotate the previous elements behind the new element
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }
    
    public int pop() {
        // The newest element is safely at the front
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */