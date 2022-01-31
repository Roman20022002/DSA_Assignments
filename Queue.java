// Class for queue
public class Queue<E> extends Stack<E> implements IQueue<E> {

    private Stack<E> s1; // for enqueue
    private Stack<E> s2; // for dequeue

    // Constructor to initialize queue
    public Queue(int size) {
        this.s1 = new Stack<>(size);
        this.s2 = new Stack<>(size);
    }

    public E dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue empty exception");
        }else {
            if(this.s2.isEmpty()) {
                while(!this.s1.isEmpty()) {
                    this.s2.push(this.s1.pop());
                }
            }
            return this.s2.pop();
        }
    }

    public void enqueue(E item) {
        if(isFull()) {
            throw new RuntimeException("Queue is full exception");
        }else {
            this.s1.push(item);
        }
    }

    public E peek() {
        if(isEmpty()) {
            throw new RuntimeException("Queue empty exception");
        }else {
            if(this.s2.isEmpty()) {
                while(!this.s1.isEmpty()) {
                    this.s2.push(this.s1.pop());
                }
            }
            return this.s2.peek();
        }
    }

    public int size() {
        return (this.s1.size() + this.s2.size());
    }

    public boolean isEmpty() {
        return (this.s1.isEmpty() && this.s2.isEmpty());
    }

    public boolean isFull() {
        return (this.s1.isFull() && this.s2.isFull());
    }
}
