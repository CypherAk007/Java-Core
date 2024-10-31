package Collections.O32_CustomQueue;
public class  CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int rear = 0;
    private int size = 0;  // Track number of elements in the queue

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        data[rear] = item;
        rear = (rear + 1) % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            throw new Exception("Queue is Empty");
        }
        int removed = data[front];
        data[front] = -1;
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        return data[front];
    }

    public void display() {
        int temp = front;
        int count = size;
        while (count > 0) {
            System.out.print(data[temp] + " ");
            temp = (temp + 1) % data.length;
            count--;
        }
        System.out.println();
    }
}
