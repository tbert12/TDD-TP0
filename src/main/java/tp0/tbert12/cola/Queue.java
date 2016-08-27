package tp0.tbert12.cola;

public interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    // Return first item, throw exception if is empty.
    T top();

    // Remove first item, throw exception if is empty.
    void remove();
}

