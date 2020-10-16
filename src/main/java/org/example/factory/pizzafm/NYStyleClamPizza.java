package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class NYStyleClamPizza extends Pizza{

    public static Pizza buildPizza(){
        return NYStyleClamPizza.builder()
                .name("NY Style Clam Pizza")
                .dough("This Crust Dough")
                .sauce("Marinara Sauce")
                .toppings(List.of("Grated Reggiano Cheese", "Fresh Clams from Long Island Sound"))
                .build();
    }
}
