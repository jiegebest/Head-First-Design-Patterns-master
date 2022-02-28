package designpatterns.behavior11.iterator.dinermergeri;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
