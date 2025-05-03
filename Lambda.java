package tb課題;

import java.util.ArrayList;
import java.util.List;

public class Lambda<T> {
    private List<T> list;

    public Lambda() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public Iterable<T> iterable() {
        return list;
    }
}