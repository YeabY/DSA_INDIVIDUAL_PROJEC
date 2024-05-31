package et.edu.aait.linkedListOperations;

public class Stack {
    private ListNode top;

    public Stack() {
        this.top = null;
    }

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Empty Stack!");
        }
        
        int val = top.value;
        top = top.next;
        return val;
    }

    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Empty Stack!");
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }
    
    public void display() {
        ListNode current = top;
        while (current != null) {
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println("null");
    }
}
