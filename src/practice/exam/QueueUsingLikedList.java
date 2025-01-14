package practice.exam;

public class QueueUsingLikedList {
    // here front will act as a head and Rear will act as a tail.
    private Node front, rear;
    public QueueUsingLikedList(){
        front = rear = null;
    }

    private class Node {
        private int item;
        Node next;

        private Node(int item) {
            this.item = item;
        }
    }

    public void enqueue(int item){
        Node newNode = new Node(item);

        if (front == null && rear == null){
            front = newNode;
        }
        else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public void dequeue(){
        if (front == null){
            System.out.println("Can not delete from empty Queue");
            return;
        }
        front = front.next;
    }

    public void display(){
        Node node = front;
        while (node != null){
            System.out.print(node.item + " -> ");
            node = node.next;
            
        }
        System.out.println("NULL");

    }
    public static void main(String[] args) {
        QueueUsingLikedList list = new QueueUsingLikedList();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        list.enqueue(60);

        list.display();

        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();

        list.display();

    }
}
