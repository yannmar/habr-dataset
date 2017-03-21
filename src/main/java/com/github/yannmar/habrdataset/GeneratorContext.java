package com.github.yannmar.habrdataset;

@FunctionalInterface
public interface GeneratorContext<T> {
    void emit(T value);
}
