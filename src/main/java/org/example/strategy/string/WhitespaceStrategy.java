package org.example.strategy.string;

public class WhitespaceStrategy implements SplitterStrategy{
    @Override
    public String[] split(String s) {
        return s.split(Separators.WHITESPACE);
    }
}
