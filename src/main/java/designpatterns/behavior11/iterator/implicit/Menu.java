package designpatterns.behavior11.iterator.implicit;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
