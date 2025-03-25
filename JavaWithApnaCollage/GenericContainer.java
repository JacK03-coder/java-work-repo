
public class GenericContainer<T> implements Container<T> {
    private T item;
    @Override
    public void add(T item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public T get() {
        return item;
    }
    
}
