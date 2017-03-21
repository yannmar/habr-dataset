package com.github.yannmar.habrdataset;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        Dataset.of(Arrays.asList("шла", "саша", "по", "шоссе"))
                .union(Arrays.asList("и", "сосала", "сушку"))
                .filter(s -> s.length() > 4)
                .map(s -> s + ", length=" + s.length())
                .forEach(System.out::println);
    }
}
