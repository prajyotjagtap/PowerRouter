package PowerRouter;

// 5. Implement stack using queue without using an array or linked list.
// ○ Push
// ○ Pop
// ○ Top

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    private Queue<Integer> primaryQueue;
    private Queue<Integer> auxiliaryQueue;

    public Stack() {
        primaryQueue = new LinkedList<>();
        auxiliaryQueue = new LinkedList<>();
    }

    
    public void push(int value) {
        
        while (!primaryQueue.isEmpty()) {
            auxiliaryQueue.add(primaryQueue.remove());
        }

        
        primaryQueue.add(value);

        
        while (!auxiliaryQueue.isEmpty()) {
            primaryQueue.add(auxiliaryQueue.remove());
        }
    }

    
    public int pop() {
        if (primaryQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
       
        return primaryQueue.remove();
    }

    
    public int top() {
        if (primaryQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        
        return primaryQueue.peek();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
    }
}
