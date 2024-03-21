package Project3;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {
    private ArrayList<T> items;

    public Bag() {
        this.items = new ArrayList<>();
    }
    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    @Override
    public int size() {
        return this.items.size();
    }
    @Override
    public void add(T item) {
        this.items.add(item);
    }
    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

}
