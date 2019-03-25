package com.homework.model;

public interface MyList <E> {
    boolean add(E e);

    void remove(int index);

    void clear();

    int size();

    E get(int index);
}
