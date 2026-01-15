class DNode {
    int data;
    DNode prev;
    DNode next;
    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList {
    DNode head;
    void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    void displayForward() {
        DNode temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void displayBackward() {
        DNode temp = head;
        if (temp == null) return;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displayForward();
        list.displayBackward();
    }
}
