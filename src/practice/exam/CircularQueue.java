package practice.exam;
/*
    what is circular queue =>
    A Circular Queue is an extended version of a normal queue where the last element of
    the queue is connected to the first element of the queue forming a circle.
    --> In the circular queue element are insert and remove in circular order.

*/

public class CircularQueue {
    private int DEFAULT_SIZE;
    private int[] data;
    private int front , size, end;
    
    public CircularQueue(){
        front = end = size = 0;
        DEFAULT_SIZE = 5;
        this.data = new int[DEFAULT_SIZE];
    }

    public void insert(int item) {
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
    }
    public int remove() throws EmptyQueueException{
        if (isEmpty()){
            throw new EmptyQueueException("Can not remove from empty queue");
        }

        int removedItem = data[front++];
        front = front % data.length;
        size--;
        return removedItem;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull(){
        return  size  == data.length;
    }


    public void display(){
        int i = front;
        do {
            System.out.print(data[i++] +  " -> ");
            i = i % data.length;
            
        }while (i != end);

        System.out.println("Start");
    }
    public static void main(String[] args) throws EmptyQueueException {
        CircularQueue queue = new CircularQueue();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.insert(50);
        queue.insert(90);

        queue.display();

        System.out.println(queue.remove());

        queue.insert(70);

        queue.display();
        System.out.println(queue.end);
        
    }
    
}
