package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class NyStylePepperoniPizza extends Pizza{

    public static Pizza buildPizza(){
        return NyStylePepperoniPizza.builder()
                .name("NY Style Pepperoni Pizza")
                .dough("This Crust Dough")
                .sauce("Marinara Sauce")
                .toppings(List.of("Grated Reggiano Cheese", "Sliced Pepperoni", "Garlic", "Onion", "Mushrooms", "Red Pepper"))
                .build();
    }
}
