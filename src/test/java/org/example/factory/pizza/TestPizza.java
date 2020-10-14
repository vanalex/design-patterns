package org.example.factory.pizza;

import org.example.factory.pizzas.Pizza;
import org.example.factory.pizzas.PizzaFactory;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPizza {
    @Test
    public void testCreatePizza(){
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("cheese");

        assertThat(pizza).isNotNull();
        assertThat(pizza.getName()).isEqualTo("Cheese Pizza");
        assertThat(pizza.getDough()).isEqualTo("regular crust");
        assertThat(pizza.getSauce()).isEqualTo("marinara sauce");
        assertThat(pizza.getToppings()).isEqualTo(List.of("parmesan"));
    }
}
