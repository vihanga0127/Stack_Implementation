package StackImplementation;

import java.util.Deque;
import java.util.LinkedList;

public class DequeStack {
    private Deque<Integer> deque;

    public DequeStack() {
        deque = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int value) {
        deque.addFirst(value);
    }

    // Pop an element from the stack
    public int pop() {
        if (deque.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return deque.removeFirst();
        }
    }

    // Peek at the top element of the stack
    public int peek() {
        if (deque.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return deque.peekFirst();
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Main method to test the Deque-based Stack
    public static void main(String[] args) {
        DequeStack stack = new DequeStack();

        // Push elements onto the stack
        stack.push(67);
        stack.push(34);
        stack.push(9);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Peek at the top element again
        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
