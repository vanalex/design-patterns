package org.example.state;

public class GunballMachine {
    private final static int MAX_NUMBER_OF_BALL = 10;
    private State state;
    private int count;

    private GunballMachine(){}

    public static GunballMachine createGunballMachine(){
        return new GunballMachine(State.HAS_QUARTER);
    }

    private GunballMachine(State state){
        this.count = MAX_NUMBER_OF_BALL;
        this.state = state;
    }

    public GunballMachine(int numberOfBalls, State state){
        this.count = numberOfBalls;
        this.state = state;
    }

    public static GunballMachine resetGunballMachine(){
        return new GunballMachine(MAX_NUMBER_OF_BALL, State.HAS_QUARTER);
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }


}
