package org.example.decorator;

public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return 2.10;
    }
}
