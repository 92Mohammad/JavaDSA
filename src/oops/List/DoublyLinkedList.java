package oops.List;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList(){
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next =  head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    private void insertLast(int value){
        Node node = new Node(value);
        // first find the tail (here I am assuming that tail is not given)
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int index, int value){
        if(index > size){
            throw new ArithmeticException("Index out of bound");
        }
        Node node = new Node(value);
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
        size++;
    }
    public int length(){
        return size;
    }


    public void remove(int key){
        // check whether first element is key or not
        if (head.val == key){
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        // check rest of the node
        Node temp = head.next;
        while (temp != null){
            if(temp.val == key){
                Node node = temp.prev;
                node.next = temp.next;
                if (temp.next != null){
                    temp.next.prev = node;
                }
                size--;
                return;
            }else {
                temp = temp.next;
            }
        }
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.val + " <=> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }

    }
}
