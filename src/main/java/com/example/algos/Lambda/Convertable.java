package com.example.algos.Lambda;

@FunctionalInterface
public interface Convertable<T, R> {
    R convert(T t);
}
