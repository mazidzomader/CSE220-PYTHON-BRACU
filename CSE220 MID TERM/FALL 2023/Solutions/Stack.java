public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Push method
    public void push(int elem) {
        Node nn = new Node(elem, top);
        top = nn;
    }

    // Pop method
    public Integer pop() {
        if (top == null) {
            // Stack underflow
            return null; // Method returns Integer instead of int to ensure this line works. If you know exception, modify this using Stack Underflow exception.
        }
        int e = (int)top.elem;
        top = top.next;
        return e;
    }

    // Peek method
    public Integer peek() {
        if (top == null) {
            // Stack underflow
            return null; // Method returns Integer instead of int to ensure this line works. If you know exception, modify this using Stack Underflow exception.
        }
        return (int) top.elem;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }
}
