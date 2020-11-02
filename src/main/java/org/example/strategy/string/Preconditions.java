package org.example.strategy.string;

public class Preconditions<T> {

    public static <T> void notNull(T t){
        if (t == null){
            throw new IllegalArgumentException("entered value is null");
        }
    }
}
