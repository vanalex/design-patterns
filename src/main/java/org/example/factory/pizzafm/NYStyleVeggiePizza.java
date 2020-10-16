package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class NYStyleVeggiePizza extends Pizza{

    public static Pizza buildPizza(){
        return NYStyleVeggiePizza.builder()
                .name("NY Style Veggie Pizza")
                .dough("This Crust Dough")
                .sauce("Marinara Sauce")
                .toppings(List.of("Grated Reggiano Cheese", "Garlic", "Onion", "Mushrooms", "Red Pepper"))
                .build();
    }
}
