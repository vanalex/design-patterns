package org.example.factory.pizza;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class PepperoniPizza extends Pizza{

    public static Pizza buildPizza(){
        return PepperoniPizza.builder()
                .name("Pepperoni Pizza")
                .dough("Crust")
                .sauce("Marinara sauce")
                .toppings(List.of("Sliced onion"))
                .build();
    }
}
