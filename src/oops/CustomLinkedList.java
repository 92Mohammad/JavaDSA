package oops;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public CustomLinkedList(){
        size = 0;

    }

    class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }
    public int length(){
        return size;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail == null){
            //it means that there is no element in the linkedList
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index > size){
            throw new ArithmeticException("Index is greater than size");
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        Node node = new Node(value);
        while(index != 0){
            if(index == 1){
                node.next = temp.next;
                temp.next = node;
            }
            else {
                temp = temp.next;
            }
            index--;
        }
        size++;
    }
    private void removeFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    private void removeLast(){
        Node temp = head;
        int index = 1;
        while (index < size){
            if (index == size - 1){
                tail = temp;
                temp.next = null;
            }else {
                temp = temp.next;

            }
            index++;
        }
        size--;
    }
    public void remove(int index){
        if(index == 0){
            removeFirst();
            return;
        }
        if(index == size){
            removeLast();
            return;
        }

        Node temp = head;
        while(index != 0){
            if (index == 1){
                Node temp2 = temp.next;
                temp.next = temp2.next;
            }
            else {
                temp = temp.next;
            }
            index--;
        }
        size--;
    }
    public Node find(int target){
        Node node = head;
        while (node != null){
            if(node.val == target){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int get(int index){
        if(index > size){
            throw new ArithmeticException("Index out of bound");
        }
        if (index == 0){
            return head.val;
        }
        if(index == size){
            return tail.val;
        }
        Node temp = head;
        while (index != 0){
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
//        System.out.println(size);
    }


}
