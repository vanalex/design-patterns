package org.example.decorator;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
