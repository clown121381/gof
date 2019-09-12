package com.yang.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        items.forEach(x-> System.out.println("name:"+x.name()+"packing"+x.packing()+"price"+x.price()));
    }
}
