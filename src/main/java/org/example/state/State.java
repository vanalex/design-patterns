package org.example.state;

public enum State {

    SOLD_OUT(0),
    NO_QUARTER(1),
    HAS_QUARTER(2),
    SOLD(3);

    State(int state) {
        this.state = state;
    }

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isSoldOut(){
        return this == SOLD_OUT;
    }

    public boolean isSold(){
        return this == SOLD;
    }

    public boolean hasQuarter(){
        return this == HAS_QUARTER;
    }

    public boolean hasNoQuarter(){
        return this == NO_QUARTER;
    }
}
