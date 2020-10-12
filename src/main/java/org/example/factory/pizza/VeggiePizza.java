package org.example.factory.pizza;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class VeggiePizza extends Pizza{

    public static Pizza buildPizza(){
        List<String> toppings = List.of("Sliced onion");
        return VeggiePizza.builder()
                .self()
                .toppings(toppings)
                .name("cheese")
                .dough("double cheese")
                .sauce("almond")
                .build();
    }
}
