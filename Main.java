package test;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    } 
}

class List {
    Node head;

    // Method to add a node at the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();

        System.out.print("Enter the number of elements to add: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.addNode(data);
        }

        list.printList();

        scanner.close();
    }
}
