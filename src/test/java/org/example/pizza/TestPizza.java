package org.example.pizza;

import org.example.factory.pizza.Pizza;
import org.example.factory.pizza.VeggiePizza;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPizza {

    @Test
    public void testCreatePizza(){
        Pizza pizza = VeggiePizza.builder()
                .name("cheese")
                .dough("double cheese")
                .sauce("almond")
                .build();

        assertThat(pizza).isNotNull();
        assertThat(pizza.getName()).isEqualTo("cheese");
        assertThat(pizza.getDough()).isEqualTo("double cheese");
        assertThat(pizza.getSauce()).isEqualTo("almond");
    }
}
