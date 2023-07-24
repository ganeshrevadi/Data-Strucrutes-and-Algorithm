import java.util.ArrayList;
class MyCircularQueue {
    private int size, front, end;
    private ArrayList<Integer> queue;
    public MyCircularQueue(int k) {
        queue =  new ArrayList<>();
        this.size = k;
        this.front = this.end = -1;
    }

    public boolean enQueue(int value) {
        if((front == 0 && end == size - 1) || (end == (front - 1) % (size - 1))){
            return false;
        }
        else if(front == -1)
        {
            front = 0;
            end = 0;
            queue.add(end, value);
        }

        else if(end == size - 1 && front != 0)
        {
            end = 0;
            queue.set(end, value);
        }

        else
        {
            end = (end + 1);
            if(front <= end)
            {
                queue.add(end, value);
            }
            else
            {
                queue.set(end, value);
            }
        }
        return true;
    }

    public boolean deQueue() {
        int temp;
        if(front == -1)
        {
            return false;
        }

        temp = queue.get(front);
        if(front == end)
        {
            front = -1;
            end = -1;
        }

        else if(front == size - 1)
        {
            front = 0;
        }
        else
        {
            front = front + 1;
        }
        return true;
    }

    public int Front() {
        return front;
    }

    public int Rear() {
        return end;
    }

    public boolean isEmpty() {
        if(front == -1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if((front == 0 && end == size - 1) || (end == (front - 1) % (size - 1))){
            return true;
        }
        return false;
    }
}
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */