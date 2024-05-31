package et.edu.aait.linkedListOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList listOps = new LinkedList();
        Stack stack = new Stack();

        while (true) {
        	System.out.println("==========================");
            System.out.println("Choose your preference:");
            System.out.println("1. Insert at the end");
            System.out.println("2. Insert at a specified position");
            System.out.println("3. Delete at a specified position");
            System.out.println("4. Delete after a node");
            System.out.println("5. Search a node");
            System.out.println("6. Display the whole list");
            System.out.println("7. Push to a stack");
            System.out.println("8. Pop from a stack");
            System.out.println("9. Peek at a stack");
            System.out.println("10. Display the whole stack");
            System.out.println("11. Close");
            
            System.out.print("What do you want to do? ");
            int preference = scanner.nextInt();

            switch (preference) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int val = scanner.nextInt();
                    listOps.insert(val);
                    System.out.println("Node inserted at end.");
                    break;

                case 2:
                    System.out.print("Enter value to insert: ");
                    int valAtPos = scanner.nextInt();
                    System.out.print("Enter position to insert at: ");
                    int position = scanner.nextInt();
                    try {
                        listOps.insertAtPos(valAtPos, position);
                        System.out.println("Node inserted at position " + position + ".");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter position to delete: ");
                    int delPos = scanner.nextInt();
                    try {
                        listOps.deleteAtPosition(delPos);
                        System.out.println("Node deleted at position " + delPos + ".");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter value of the node after which to delete: ");
                    int delAfterVal = scanner.nextInt();
                    listOps.deleteAfterNode(delAfterVal);
                    System.out.println("Node after value " + delAfterVal + " deleted.");
                    break;

                case 5:
                    System.out.print("Enter value to search for: ");
                    int searchVal = scanner.nextInt();
                    boolean found = listOps.searchNode(searchVal);
                    System.out.println("Node with value " + searchVal + (found ? " found." : " not found."));
                    break;

                case 6:
                    System.out.println("Linked List:");
                    listOps.display();
                    break;

                case 7:
                    System.out.print("Enter value to push to stack: ");
                    int pushVal = scanner.nextInt();
                    stack.push(pushVal);
                    System.out.println("Value pushed to stack.");
                    break;

                case 8:
                    try {
                        int poppedVal = stack.pop();
                        System.out.println("Popped value: " + poppedVal);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 9:
                    try {
                        int peekVal = stack.peek();
                        System.out.println("Top value: " + peekVal);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 10:
                    System.out.println("Stack:");
                    stack.display();
                    break;

                case 11:
                    System.out.println("Closed! Bye");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("==========================");
        }
    }
}
