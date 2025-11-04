package com.example.algos.lesson;

@FunctionalInterface
public interface Convertable<T, R> {
    R convert(T t);
}
