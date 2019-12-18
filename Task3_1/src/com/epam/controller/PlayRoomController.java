package com.epam.controller;

import com.epam.model.PlayRoomModel;
import com.epam.model.entities.*;
import com.epam.view.PlayRoomView;

public class PlayRoomController {
    PlayRoomModel model;
    PlayRoomView view;

    public PlayRoomController() {
        this.model= new PlayRoomModel<>();
        this.view = new PlayRoomView();
    }

    public void run() {
        model.addToy(new Car("BMW", 15,15));
        view.viewData(model.showToys());
        view.viewData("----------------------------------------------");
        model.addToy(new AnimalDoll("Teady",4,10));
        model.addToy(new HumanDoll("Suzy",7,15));
        model.addToy(new Robot("Terminator",8,12));
        model.addToy(new AnimalDoll("Zebra",1,11));
        model.addToy(new Robot("BamblBe",8,16));
        view.viewData(model.showToys());
        view.viewData("-----------------------------------");
        view.viewData("Total price -> " + model.getTotalPrice());
        view.viewData("-----------------------------------------------");
        view.viewData(model.getSortedToys());


    }
}
