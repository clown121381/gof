package com.yang.builder;

import org.junit.Test;

public class TestBuilder {

    @Test
    public void test1(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.prepareNonVegMeal();
        System.out.println("Veg Meal");
        meal1.showItems();
        System.out.println("total cost"+meal1.getCost());

        Meal meal2 = mealBuilder.prepareVegMeal();
        System.out.println("NonVeg Meal");
        meal2.showItems();
        System.out.println("total cost"+meal2.getCost());
    }
}
