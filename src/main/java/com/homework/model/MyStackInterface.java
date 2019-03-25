package com.homework.model;

public interface MyStackInterface<E> {
    E push(E item);

    void remove(int index);

    void clear();

    int size();

    E peek();

    E pop();
}
