package com.example.algos.Lambda;

@FunctionalInterface
public interface StringPlusInt<T, R> {
    R plusInt(T t, R r);
}
