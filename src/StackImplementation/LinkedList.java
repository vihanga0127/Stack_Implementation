package StackImplementation;

public class LinkedList {
	
	    private Node top;

	    // Node class for the linked list
	    private class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Constructor to initialize the stack
	    public LinkedList() {
	        top = null;
	    }

	    // Push an element onto the stack
	    public void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	    }

	    // Pop an element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty!");
	            return -1;
	        }
	        int value = top.data;
	        top = top.next;
	        return value;
	    }

	    // Peek at the top element of the stack
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty!");
	            return -1;
	        }
	        return top.data;
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return top == null;
	    }

	    // Main method to test the Linked List-based Stack
	    public static void main(String[] args) {
	    	LinkedList stack = new LinkedList();

	        // Push elements onto the stack
	        stack.push(90);
	        stack.push(57);
	        stack.push(21);

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


