package com.epam.model.entities;

public class NoItem extends Insurance {
    public NoItem() {
        super(0,0,null,"");
    }

    @Override
    public String toString() {
        return "No item was found\n";
    }
}
