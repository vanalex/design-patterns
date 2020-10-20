package org.example.template.simplebarista;

import org.example.template.simplebarista.Coffee;
import org.example.template.simplebarista.Tea;
import org.junit.Test;

public class TemplateTest {

    @Test
    public void testPrepareTea(){
        Tea tea = new Tea();
        tea.prepareRecipe();
    }

    @Test
    public void testPrepareCoffee(){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
