package org.example.factory.pizzafm;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return NYStyleCheesePizza.buildPizza();
        }else if ("clam".equals(item)){
            return NYStyleClamPizza.buildPizza();
        }else if ("pepperoni".equals(item)){
            return NYStyleClamPizza.buildPizza();
        }else if ("veggie".equals(item)){
            return NYStyleClamPizza.buildPizza();
        }else{
            throw new IllegalArgumentException(String.format("Pizza % does not exists in our store", item));
        }
    }
}
