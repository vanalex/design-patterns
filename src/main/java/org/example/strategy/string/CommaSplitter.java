package org.example.strategy.string;

public class CommaSplitter implements SplitterStrategy{

    @Override
    public String[] split(String s) {
        Preconditions.notNull(s);
        return s.split(Separators.COMMA);
    }
}
