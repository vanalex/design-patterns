package org.example.factory.pizzas;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ClamPizza extends Pizza{

    public static Pizza buildPizza(){
        return ClamPizza.builder()
                .name("Clam Pizza")
                .dough("thin crust")
                .sauce("white garlic sauce")
                .toppings(List.of("Grated parmesan cheese"))
                .build();
    }
}
