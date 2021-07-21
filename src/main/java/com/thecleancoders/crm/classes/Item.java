package com.thecleancoders.crm.classes;

import java.util.List;

public abstract class Item {
    private int id;

    // Constructor

    public Item(List<Item> itemList) {
        setId(itemList);
    }

    // Methods

    public static Item getById(int id, List<Item> itemList){
        for(Item item : itemList){
            if(id == item.getId()){
                return item;
            }
        }
        throw new NullPointerException("This id has no related item");
    }

    // Setters

    public void setId(List<Item> itemList){
        if (itemList.size() == 0){
            this.id = 1;
        } else {
            this.id = itemList.get(itemList.size() - 1).getId() + 1;
        }
    }

    // Getters

    public int getId(){
        return this.id;
    }
}
