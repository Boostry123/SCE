package set;
//Author : Yanir Latyshev
//Assignment : 3

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * this class is a set of elements which you can make manipulations on.
 * @param <E>
 */
public class SimpleSet<E> implements Set<E> {
    private int capacity;
    private E[] elements;
    private int size = 0;


    /**
     * this is the main constructor of the object.
     * @param capacity
     *
     */
    public SimpleSet(int capacity) {
        this.capacity = capacity;
        this.elements =(E[]) new Object[capacity];
    }

    /**
     * constructor
     * if no params have been gives the default capacity is set to be 5.
     */
    public SimpleSet(){
        this(5);
    }

    /**
     * @return the elements in the set
     */
    public E[] getElements() {
        return elements;
    }

    /**
     * adds an elements to the set
     * @param e
     * return void
     */
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

    /**
     * removes an element from the Set
     * @param e
     * return void
     *
     */
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

    /**
     * check if an elements is contained in the set.
     * @param e
     * @return
     */
    public boolean contains(E e){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(e)){
                return true;}
        }
        return false;
    }

    /**
     * checks if the set is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    /**
     * toString of the object
     * @return String
     */
    @Override
    public String toString() {
        return "SimpleSet{" +
                "capacity=" + capacity +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}