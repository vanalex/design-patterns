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

    @Test
    public void testBeverageWithHook(){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
