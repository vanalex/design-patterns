package org.example.strategy;

public class FakeQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Qwak!");
    }
}
