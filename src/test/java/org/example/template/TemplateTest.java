package org.example.template;

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
