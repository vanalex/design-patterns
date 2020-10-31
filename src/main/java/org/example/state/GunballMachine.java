package org.example.state;

public class GunballMachine {
    private State state;

    private GunballMachine(){}

    public static GunballMachine createGunballMachine(){
        return new GunballMachine(State.HAS_QUARTER);
    }

    public GunballMachine(State state){
        this.state = state;
    }

    public void changeState(State state){
        this.state = state;
    }

    public static GunballMachine resetGunballMachine(){
        return new GunballMachine( State.HAS_QUARTER);
    }

    public State getState() {
        return state;
    }
}
