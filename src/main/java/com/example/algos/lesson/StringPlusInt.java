package com.example.algos.lesson;

@FunctionalInterface
public interface StringPlusInt<T, R> {
    R plusInt(T t, R r);
}
