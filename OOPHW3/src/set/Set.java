package set;
//Author : Yanir Latyshev
//Assignment : 3

/**
 * an interface for creating a set of elements.
 * @param <E>
 */
public interface Set<E> {
    public void add(E e);
    public void remove(E e);
    public boolean contains(E e);
    public int size();
    public boolean isEmpty();
}
