package org.example.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator(){
        Beverage expresso = new Expresso();
        print(expresso);

        Beverage darkRoast = new DarkRoast();
        Mocha mocha  = new Mocha(darkRoast);

        print(mocha);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        print(beverage3);
    }

    private void print(Beverage beverage){
        System.out.println(String.format("%s costs %f", beverage.getDescription(), beverage.cost()));
    }
}
