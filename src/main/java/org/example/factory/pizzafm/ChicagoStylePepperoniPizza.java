package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ChicagoStylePepperoniPizza extends Pizza{

    public static Pizza buildPizza(){
        return ChicagoStylePepperoniPizza.builder()
                .name("Chicago Style Pepperoni Pizza")
                .dough("Extra Thick Crust Dough")
                .sauce("Plum Tomato Sauce")
                .toppings(List.of("Shredded Mozzarella Cheese", "Black Olives", "Spinach", "Eggplant", "Sliced Pepperoni"))
                .build();
    }
}
