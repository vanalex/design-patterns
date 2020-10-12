package org.example.factory.pizza;

public class PizzaFactory {

    public Pizza createPizza(String type){
        if ("cheese".equals(type)) {
            return CheesePizza.buildPizza();
        } else if ("pepperoni".equals(type)) {
            return PepperoniPizza.buildPizza();
        } else if ("clam".equals(type)) {
            return ClamPizza.buildPizza();
        } else if ("veggie".equals(type)) {
            return VeggiePizza.buildPizza();
        }else {
            throw new IllegalArgumentException(String.format("%s is not a type of pizza", type));
        }
    }

}
