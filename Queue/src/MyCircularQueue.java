import java.util.List;
import java.util.ArrayList;
class MyCircularQueue
{
    List<Integer> queue;
    int queue_size = 0;

    public MyCircularQueue(int k)
    {
        this.queue = new ArrayList<Integer>();
        this.queue_size = k;
    }

    public boolean enQueue(int value)
    {
        if( queue.size() < this.queue_size)
        {
            queue.add(value);
            return true;
        }
        else
            return false;
    }

    public boolean deQueue()
    {
        if(queue.size() >0){
            queue.remove(0);
            return true;
        }
        else
            return false;

    }

    public int Front()
    {
        if(queue.size() >0)
            return queue.get(0);
        else
            return -1;
    }

    public int Rear()
    {
        if(queue.size() >0)
            return queue.get(queue.size() -1);
        else
            return -1;

    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public boolean isFull()
    {
        if(queue.size() == this.queue_size)
            return true;
        else
            return false;
    }
}