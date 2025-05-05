package tb課題;

import java.util.ArrayList;

public class ObjectList<T> {
	private ArrayList<T> list;

	public ObjectList() {
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
