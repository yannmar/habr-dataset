package com.github.yannmar.habrdataset;

@FunctionalInterface
public interface Generator<T> {
    void generate(GeneratorContext<T> context);
}
