package com.task2_1.controller;

import com.task2_1.model.ShapeModel;
import com.task2_1.model.ShapesAreaComparator;
import com.task2_1.model.ShapesColorComparator;
import com.task2_1.view.InputData;
import com.task2_1.view.ShapeView;

import java.util.Comparator;

public class ShapeController {
    private ShapeModel model = new ShapeModel();
    private ShapeView view = new ShapeView();

    public void run() {
        view.viewData(ConverterInString.convertArrayShapes(model.getShapes()));
        view.viewData("---------------------------------------------------------------");
        view.viewData(ConverterInString.convertDouble(model.getTotalArea(),"Total area"));
        view.viewData("---------------------------------------------------------------");
        view.viewData(model.getAreaByTypes());
        view.viewData("---------------------------------------------------------------");
        view.viewData(model.getSorted());


    }
}
