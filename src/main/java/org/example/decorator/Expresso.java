package org.example.decorator;

public class Expresso extends Beverage{

    public Expresso(){
        description = "Expresso coffee";
    }

    @Override
    public double cost() {
        return .55;
    }
}
