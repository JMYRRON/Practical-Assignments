package com.epam.controller;

import com.epam.model.InsuranceModel;
import com.epam.model.entities.Duration;
import com.epam.view.InputData;
import com.epam.view.InsuranceView;

public class InsuranceController {
    private InsuranceModel model;
    private InsuranceView view;

    public InsuranceController() {
        this.model = new InsuranceModel();
        this.view = new InsuranceView();
    }

    public void run(){
        start();
    }

    private void start(){

        boolean flag = true;

        view.viewData("Hello, choose operation:\n" +
                "(1) to create and agreement;\n" +
                "(2) to show actual agreement;\n" +
                "(3) to add 1 element to agreement;\n" +
                "(4) to get total price of agreement;\n" +
                "(5) to get particular item of agreement;\n" +
                "(6) to get sorted agreement;\n" +
                "(7) to finish program.");

        while (flag) {
            view.viewData("1:create/2:show/3:add/4:total price/5:get item/6:sort/7:exit;");
            String message = InputData.scan();
            switch (message) {
                case "7": {
                    flag = false; break;
                }
                case "1": {
                    view.viewData("Enter the number of items: ");
                    int number = InputData.scanInt();
                    model.setAgreement(number);
                    break;
                }
                case "2": {
                    if (model.isCheck()){
                        view.viewData(ConverterToString.converteToString(model.getAgreement()));
                        break;
                    } else {
                        view.viewData("You do not have an agreement, choose command (1)."); break;
                    }

                }
                case "3": {
                    if (!model.isCheck()) {
                        view.viewData("You do not have an agreement, choose command (1)."); break;
                    }
                    if (model.getAgreement_index()==model.getAgreement().length) {
                        view.viewData("Your agreement is full");
                        break;
                    }
                    view.viewData("Enter the type of insurance (life/car/property):");
                    String type = InputData.scan();
                    view.viewData("Enter the risk of insurance:");
                    int risk = InputData.scanInt();
                    view.viewData("Enter the price of insurance:");
                    int price = InputData.scanInt();
                    view.viewData("Enter the description of insurance:");
                    String description = InputData.scan();
                    view.viewData("Enter the duration of insurance \n((1) - 1 month\n" +
                            "(2) - 3 months\n" +
                            "(3) - 6 months\n" +
                            "(4) - 9 months/(5) - year):");
                    Duration duration;
                    String num = InputData.scan();
                    switch (num){
                        case "1": duration = Duration.MONTH_1;break;
                        case "2": duration = Duration.MONTHS_3;break;
                        case "3": duration = Duration.MONTHS_6;break;
                        case "4": duration = Duration.MONTHS_9;break;
                        case "5": duration = Duration.YEAR;break;
                        default: duration = Duration.MONTH_1;break;
                    }
                    model.addInsuranceItem(type,description,price,risk,duration);
                    break;
                }
                case "4": {
                    if (!model.isCheck()) {
                        view.viewData("You do not have an agreement, choose command (1)."); break;
                    }
                    view.viewData("" + model.getTotalPrice());break;
                }

                case "5":{
                    if (!model.isCheck()) {
                        view.viewData("You do not have an agreement, choose command (1)."); break;
                    }
                    view.viewData("Enter criteria (price/risk)");
                    String criteria = InputData.scan();
                    switch (criteria.toLowerCase()) {
                        case "price": {
                            view.viewData("Enter first number: ");
                            int first = InputData.scanInt();
                            view.viewData("Enter second number: ");
                            int second = InputData.scanInt();
                            view.viewData(ConverterToString.converteToString(model.getItemsByPrice(first, second)));
                            break;
                        }
                        case "risk":{
                            view.viewData("Enter first number: ");
                            int first = InputData.scanInt();
                            view.viewData("Enter second number: ");
                            int second = InputData.scanInt();
                            view.viewData(ConverterToString.converteToString(model.getItemsByRisk(first, second)));
                            break;
                        }
                        default: view.viewData("Wrong criteria!");
                    }
                    break;
                }
                case "6":{
                    if (!model.isCheck()) {
                        view.viewData("You do not have an agreement, choose command (1)."); break;
                    }
                    view.viewData("Enter the criteria (price/risk/duration): ");
                    String criteria = InputData.scan();
                    switch (criteria) {
                        case "price": {
                            view.viewData(ConverterToString.converteToString(model.getSortedByPrice()));
                            break;
                        }
                        case "risk": {
                            view.viewData(ConverterToString.converteToString(model.getSortedByRisk()));
                            break;
                        }
                        case "duration": {
                            view.viewData(ConverterToString.converteToString(model.getSortedByDuration()));
                            break;
                        }
                        default: view.viewData("Wrong criteria!");
                    }
                    break;
                }
                default:view.viewData("Wrong command!");

            }
        }
    }
}
