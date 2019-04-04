package de.thro.inf.prg3.a02;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {

    Element head;


    private static class SimpleIteratorImpl implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    private static class Element {
        Object item;
        Element next;
    }

    @Override
    public void add(Object item) {
        if (this.head == null) {
            this.head = (Element) item;
        }
        else {
            for ( Iterator i = list.iterator(); i.hasNext(); )
            {
                Object o = i.next();
            }
            this.head.next = (Element) item;
        }


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        return null;
    }

    @Override
    public boolean include(Object item) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    // TODO: Implement the required methods.

}
