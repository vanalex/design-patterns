package org.example.strategy;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
