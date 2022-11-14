package com.epam.rd.autocode.collection.array;

import java.util.*;

public class SimpleArrayListImpl implements SimpleArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private static final int FACTOR_MULTIPLIER = 2;
    private static final double INCREASE_LOAD_FACTOR = 0.75;
    private static final double DECREASE_LOAD_FACTOR = 0.4;

    private Object[] elements;
    private int size;

    /**
     * Creates a list with the default capacity = 10.
     */
    public SimpleArrayListImpl() {
        // place your code here
    }

    @Override
    public boolean add(Object element) {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public int capacity() {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean decreaseCapacity() {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(int index) {
        // place your code here
        throw new UnsupportedOperationException();
    }

    private boolean isEmpty() {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Object> remove(Object el) {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        // place your code here
        throw new UnsupportedOperationException();
    }
}
