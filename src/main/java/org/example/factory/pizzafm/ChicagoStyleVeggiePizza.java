package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ChicagoStyleVeggiePizza extends Pizza{

    public static Pizza buildPizza(){
        return ChicagoStyleVeggiePizza.builder()
                .name("Chicago Deep Dish Veggie Pizza")
                .dough("Extra Thick Crust Dough")
                .sauce("Plum Tomato Sauce")
                .toppings(List.of("Shredded Mozzarella Cheese", "Black Olives", "Spinach", "Eggplant"))
                .build();
    }
}
