package org.example.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        if ("cheese".equals(item)){
            return ChicagoStyleCheesePizza.buildPizza();
        }else{
            throw new IllegalArgumentException(String.format("Pizza % does not exists in our store", item));
        }

    }
}
