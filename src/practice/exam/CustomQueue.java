package practice.exam;

class CustomQueue {

    private int[] data;
    private int CAPACITY;
    private int front, rear;

    public CustomQueue(int c){
        this.front = 0;
        this.rear = -1;
        this.CAPACITY = c;
        this.data = new int[CAPACITY];
    }   
    public void enqueue(int item) throws QueueOverFlowException{
        if (isFull()){
            throw new QueueOverFlowException("Queue is full");
        }
        data[++rear] = item;
    }
    public int dequeue() throws EmptyQueueException{
        if (front > rear){
            throw new EmptyQueueException("can not remove from empty queue");
        }
        int removedItem = data[front];
        // here we need to shift all the element to left
        for (int i = 0; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        return removedItem;
    }

    private boolean isFull(){
        return rear == this.CAPACITY - 1;
    }

    public void display(){
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + "<--");
        }
        System.out.println();
    }

    public int front() throws EmptyQueueException{
        if (front == 0){
            throw new EmptyQueueException("Queue is empty");
        }
        return data[front];
    }
}

class QueueOverFlowException extends Exception {
    public QueueOverFlowException(String message){
        super(message);
    }
}


class EmptyQueueException extends Exception{

    public EmptyQueueException(String message){
        super(message);
    }
}