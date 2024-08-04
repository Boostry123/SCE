package queue;
//Author : Yanir Latyshev
//Assignment : 3
public class  ArrayQueue implements Queue
{

    private Object[] queue = new Object[20];
    private int size;

    /**
     * adds an elements to the queue (to the end)
     * @param element the element to add
     * @return
     */
    public boolean enqueue(Object element){
        if(size < 20){
            for(int i = 0; i < size-1 ; i++){
                if(queue[i] == null){
                    queue[i] = element;
                    break;
                }
            }
            size++;
            return true;
        }else{
            return false;
        }

    }

    /**
     * removes the first elements in the queue
     * @return void
     */
    public Object dequeue(){
        if (queue[0] != null){
            Object temp = queue[0];
            for(int i= 0; i< queue.length; i++){
                queue[i] = queue[i+1];
                size--;
            }
            return temp;
        }else{
            return null;
        }
    }

    /**
     * returns the first item in the queue.
     * @return
     */
    public Object peek(){
        if (queue[0] != null){
            return queue[0];
        }else{
            return null;
        }
    }

    /**
     * @return size of the queue
     */
    public int size(){
        return size;
    }

    /**
     * @return returns boolean according if the queue is empty
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * @return returns boolean according if the queue is full.(size == 20).
     */
    public boolean isFull(){
        return size == 20;
    }



}