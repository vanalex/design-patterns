package org.example.strategy.duck;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cant fly!");
    }
}
