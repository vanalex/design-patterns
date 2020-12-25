package org.example.strategy.duck;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
