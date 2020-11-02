package org.example.strategy.string;

public class PointStrategy implements SplitterStrategy{
    @Override
    public String[] split(String s) {
        return s.split(Separators.POINT);
    }
}
