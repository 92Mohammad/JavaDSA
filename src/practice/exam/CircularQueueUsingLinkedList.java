package practice.exam;

public class CircularQueueUsingLinkedList {
    private Node front, rear;
    // basically here concept of circular linked list will use. only the operation of addition and removal will be of  queue
    // front is like a head and rear is like a tail.
    CircularQueueUsingLinkedList() {
        this.front = this.rear = null;
    } 
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value= value;
        }
    }
    private boolean isEmpty () {
        return front == null && rear == null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if (isEmpty()){
            // means that queue is empty, so we are going to add first element
            front = rear = newNode;
            rear.next = front;
        }
        else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;  // creating  cycle.
        }
    }

    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Can not remove from empty queue");
            return -1;
        }
        int data = front.value;

        if (front == rear){
            front = rear = null;
        }
        else {
            front = front.next;
            rear.next = front;
        }
        return data;
    }


    public void display() {
        Node node = front;
        if (node == null) return;

        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        }while(node != front);
        System.out.println("Start");
    }

    public static void main(String[] args) {
        CircularQueueUsingLinkedList queue = new CircularQueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
    
}
