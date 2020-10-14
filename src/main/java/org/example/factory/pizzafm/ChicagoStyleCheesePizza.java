package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ChicagoStyleCheesePizza extends Pizza {

    public static Pizza buildPizza(){
        return ChicagoStyleCheesePizza.builder()
        .name("Chicago Style Deep Dish Cheese Pizza")
        .dough("Extra Thick Crust Dough")
        .sauce("Plum Tomato Sauce")
                .toppings(List.of("Shredded Mozzarella Cheese"))
                .build();
    }
}
