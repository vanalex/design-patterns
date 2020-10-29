package org.example.strategy;

public class MallardDuck extends Duck{

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
