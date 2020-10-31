package org.example.state;

public class SoldState implements StateStrategy{
    @Override
    public GunballMachine action(GunballMachine gunballMachine) {
         //missing a checker of number of balls
         return new GunballMachine(0, State.SOLD_OUT);
    }
}
