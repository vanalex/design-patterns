package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class NYStyleCheesePizza extends Pizza{

    public static Pizza buildPizza(){
        return NYStyleCheesePizza.builder()
        .name("NY Style Sauce and Cheese Pizza")
        .dough("Thin Crust Dough")
        .sauce("Marinara Sauce")
                .toppings(List.of("Grated Reggiano Cheese"))
                .build();
    }
}
