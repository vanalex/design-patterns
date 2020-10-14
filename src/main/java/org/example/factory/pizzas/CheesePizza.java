package org.example.factory.pizzas;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class CheesePizza extends Pizza{

    public static Pizza buildPizza(){
        return CheesePizza.builder()
                .name("Cheese Pizza")
                .dough("regular crust")
                .sauce("marinara sauce")
                .toppings(List.of("parmesan"))
                .build();
    }
}
