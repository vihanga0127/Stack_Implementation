package StackImplementation;

public class ArrayBased {
	
	    private int[] stack;
	    private int top;
	    private int capacity;

	    // Constructor to initialize the stack
	    public ArrayBased(int size) {
	        stack = new int[size];
	        capacity = size;
	        top = -1;
	    }

	    // Push an element onto the stack
	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack is full!");
	            return;
	        }
	        stack[++top] = value;
	    }

	    // Pop an element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty!");
	            return -1;
	        }
	        return stack[top--];
	    }

	    // Peek at the top element of the stack
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty!");
	            return -1;
	        }
	        return stack[top];
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Check if the stack is full
	    public boolean isFull() {
	        return top == capacity - 1;
	    }

	    // Main method to test the Array-based Stack
	    public static void main(String[] args) {
	    	ArrayBased stack = new ArrayBased(3);

	        // Push elements onto the stack
	        stack.push(56);
	        stack.push(74);
	        stack.push(32);

	        // Attempt to push another element (should fail)
	        stack.push(29);

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



