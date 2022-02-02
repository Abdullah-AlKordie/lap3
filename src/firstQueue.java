public class firstQueue<E> implements Queue<E> {
    E[] data;
    static final int CAPACITY = 100;
    int size = 0;
    int f = 0;

    public firstQueue(int c) {
        data = (E[]) new Object[c];
    }

    public firstQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void enqueue(E element) {
        if (size() == data.length)
            throw new IllegalStateException("Queue is full");
        int x = (f + size) % data.length;
        data[x] = element;
        size++;
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E first() {
        return null;
    }
}
