package de.thro.inf.prg3.a02;

import java.util.Iterator;

public class SimpleListImpl implements SimpleList, Iterable {

    Element head;
    int size = 0;

    private static class Element {
        Object item;
        Element next;
        Element(Object o) { item = 0; }
    }

    @Override
    public void add(Object o) {
        size++;

        if (this.head == null) {
            this.head = new Element(o);
            return;
        }

        Element it = head;
        while (it.next != null) {
            it = it.next;
        }

        it.next = new Element(o);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        SimpleList sl = new SimpleListImpl();
        for (Object o : this) {
            if (filter.include(o)) {
                sl.add(o);
            }
        }

        return sl;
    }

    //muss noch richtig gestellt werden
    @Override
    public boolean include(Object item) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Element current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Object next() {
                Object o = current.item;
                current = current.next;
                return o;
            }
        };
    }
}
