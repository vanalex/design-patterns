package org.example.factory.pizzafm;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return NYStyleCheesePizza.buildPizza();
        }else{
            throw new IllegalArgumentException(String.format("Pizza % does not exists in our store", item));
        }
    }
}
