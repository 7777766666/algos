package com.example.algos.Lambda;

@FunctionalInterface
public interface Increment<T, R> {
    T inc(T t, R r);
}
