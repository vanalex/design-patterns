package org.example.adapter;

public class DuckAdapter implements Turkey{

    private Duck duck;

    public DuckAdapter(Duck duck){
        duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
