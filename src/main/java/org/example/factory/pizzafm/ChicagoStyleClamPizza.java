package org.example.factory.pizzafm;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ChicagoStyleClamPizza extends Pizza{

    public static ChicagoStyleClamPizza buildPizza(){
        return ChicagoStyleClamPizza.builder()
        .name("Chicago Style Clam Pizza")
        .dough("Extra Thick Crust Dough")
        .sauce("Plum Tomato Sauce")
       . toppings(List.of("Shredded Mozzarella Cheese","Frozen Clams from Chesapeake Bay"))
                .build();
    }

}
