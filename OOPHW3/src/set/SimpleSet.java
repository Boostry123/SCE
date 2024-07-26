package set;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleSet<E> implements Set<E> {
    private int capacity;
    private E[] elements;
    private int size = 0;



    public SimpleSet(int capacity) {
        this.capacity = capacity;
        this.elements =(E[]) new Object[capacity];
    }

    public SimpleSet(){
        this(5);
    }

    public E getElements(int index) {
        return elements[index];
    }

    @Override
    public void add(E e){
        if(size == capacity){
            elements = Arrays.copyOf(elements,capacity+5);
            elements[size] = e;
            size++;}
        else if(elements[size] != e){
            elements[size] = e;
            size++;
        }
    }
    public void remove(E e){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(e)){
                if(i < capacity-1){
                    for(int j = i+1; j < size; j++){
                        elements[i] = elements[j];
                    }
                    elements[size-1] = null;
                    size--;
                }else{
                    elements[size-1] = null;
                    size--;
                }



            }
        }
    }
    public boolean contains(E e){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(e)){
                return true;}
        }
        return false;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "SimpleSet{" +
                "capacity=" + capacity +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
