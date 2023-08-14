package com.epam.rd.autocode.collection.array;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

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
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean add(Object element) {
        Objects.requireNonNull(element);
        increaseDataArrayIfFull();
        elements[size] = element;
        size++;
        return true;
    }

    private void increaseDataArrayIfFull() {
        int newSize = (int) (elements.length * INCREASE_LOAD_FACTOR * FACTOR_MULTIPLIER);
        if (elements.length == size ) {
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean decreaseCapacity() {
        // place your code here
        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(int index) {
        Objects.checkIndex(index, size);
        return elements[index];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Optional<Object> remove(Object el) {
        Objects.requireNonNull(el);
        Object del = null;
        for (int i = 0; i < elements.length; i++) {
            if (el.equals(elements[i])) {
                del = elements[i];
                System.arraycopy(elements, i + 1, elements, i, size - 1);
                size--;
            }
        }
        return Optional.ofNullable(del);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner elJoin = new StringJoiner(", ", "[", "]");
        for (Object element : elements) {
            if (element != null) {
                elJoin.add(element.toString());
            }
        }
        return elJoin.toString();
    }
}
