package org.example.template.barista;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void testPrepareTea(){
        Tea tea = new Tea();
        tea.addCondiments();
        tea.prepareRecipe();
    }

    @Test
    public void testPrepareCoffee(){
        Coffee coffee = new Coffee();
        coffee.addCondiments();
        coffee.addCondiments();
    }
}
