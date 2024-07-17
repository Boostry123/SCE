package queue;
//Author : Yanir Latyshev
//Assignment : 3
public class  ArrayQueue implements Queue
{

    private Object[] queue = new Object[20];
    private int size;

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
    public Object peek(){
        if (queue[0] != null){
            return queue[0];
        }else{
            return null;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size == 20;
    }



}