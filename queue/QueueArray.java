public class QueueArray {
    static int front = 0, rear = -1, size = 5;
    static int[] queue = new int[size];
    public static void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            queue[++rear] = value;
        }
    }
    public static void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Removed: " + queue[front++]);
        }
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        dequeue();
    }
}
