package org.example.sandbox.queue;

public interface Queue2<E> {
    boolean add(E e);
    E remove();
    E element();
    boolean isEmpty();


}
