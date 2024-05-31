package et.edu.aait.linkedListOperations;


public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtPos(int val, int position) {
        ListNode newNode = new ListNode(val);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        ListNode current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) {
            throw new IndexOutOfBoundsException("Position doesn't exist!");
        }

        current.next = current.next.next;
    }

    public void deleteAfterNode(int val) {
        ListNode current = head;
        while (current != null && current.value != val) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to search for a node with a specific value
    public boolean searchNode(int val) {
        ListNode current = head;
        while (current != null) {
            if (current.value == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to display the linked list
    public void display() {
        ListNode current = head;
        if(current == null) {
        	System.out.println("No list currently!");
        	return;
        }
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
