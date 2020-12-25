package org.example.strategy.duck;

public class ModelDuck extends Duck{

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
