package myqueueADT;

public interface MyQueueADT<E> {
    int size();
    boolean isEmpty();
    void enqueue(E element);
    E dequeue();
    E front();
    E rear();
    E peek();
    void traverse();
}
