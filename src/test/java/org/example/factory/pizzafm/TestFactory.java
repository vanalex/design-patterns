package org.example.factory.pizzafm;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFactory {

    @Test
    public void testPizzaFactory(){
        PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        assertThat(pizza).isNotNull();
        assertThat(pizza.getName()).isEqualTo("Chicago Style Deep Dish Cheese Pizza");
        assertThat(pizza.getDough()).isEqualTo("Extra Thick Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Plum Tomato Sauce");
        assertThat(pizza.getToppings()).isEqualTo(List.of("Shredded Mozzarella Cheese"));

        pizza = store.orderPizza("clam");
        assertThat(pizza).isNotNull();
        assertThat(pizza.getName()).isEqualTo("Chicago Style Clam Pizza");
        assertThat(pizza.getDough()).isEqualTo("Extra Thick Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Plum Tomato Sauce");
        assertThat(pizza.getToppings()).isEqualTo(List.of("Shredded Mozzarella Cheese","Frozen Clams from Chesapeake Bay"));

        store = new NewYorkPizzaStore();
        pizza = store.orderPizza("cheese");
        assertThat(pizza).isNotNull();
        assertThat(pizza.getName()).isEqualTo("NY Style Sauce and Cheese Pizza");
        assertThat(pizza.getDough()).isEqualTo("Thin Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Marinara Sauce");
        assertThat(pizza.getToppings()).isEqualTo(List.of("Grated Reggiano Cheese"));
    }
}
