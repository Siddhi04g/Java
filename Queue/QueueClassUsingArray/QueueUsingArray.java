package Queue.QueueClassUsingArray;

public class QueueUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size(){ //O(1):time
        return size;
    }

    boolean isEmpty(){ //O(1):time
       return size==0;
    }

    int peek() throws QueueEmptyException{ //O(1):time
        if(front == -1){  //size == 0
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int element) throws QueueFullException{ //O(1):time
        if(size == data.length){
            //throw new QueueFullException();
            doubleCapacity();
        }
        if(size == 0) front = 0;

        data[++rear] = element;
        size++;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        int idx = 0;
        for(int i = front; i < temp.length ; i ++){
            data[idx] = temp[i];
            idx++;
        }
    }

    int dequeue()throws QueueEmptyException{//O(1):time
        if(front == -1){
            throw new QueueEmptyException();
        }

        int temp = data[front++];
        size --;
        if(front > rear){ //size = 0
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
