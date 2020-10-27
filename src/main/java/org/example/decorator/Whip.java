package org.example.decorator;

public class Whip extends CondimentDecorator{

    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.45;
    }
}
