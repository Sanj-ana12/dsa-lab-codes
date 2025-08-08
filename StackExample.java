package text;

import java.util.Scanner;

public class StackExample {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    Scanner sc = new Scanner(System.in);

    // Method to push element onto stack
    public void push() {
        if (top == max - 1) {
            System.out.println("Stack Overflow. Cannot push more elements.");
        } else {
            System.out.print("Enter value to push: ");
            int x = sc.nextInt();
            top = top + 1;
            stack[top] = x;
            System.out.println("Element pushed: " + x);
        }
    }

    // Method to pop element from stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. Stack is empty.");
        } else {
            int popped = stack[top];
            top = top - 1;
            System.out.println("Element popped: " + popped);
        }
    }

    // Method to see top element
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Method to print all elements in stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Menu method
    public void menu() {
        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    printStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        StackExample s = new StackExample();
        s.menu();
    }
}
