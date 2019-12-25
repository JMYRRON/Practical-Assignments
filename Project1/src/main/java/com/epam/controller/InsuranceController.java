package com.epam.controller;

import com.epam.model.InsuranceModel;
import com.epam.view.InputData;
import com.epam.view.InsuranceView;

public class InsuranceController {
    private InsuranceModel model;
    private InsuranceView view;

    public InsuranceController(){
        model = new InsuranceModel();
        view = new InsuranceView();
    }

    public void run(){
        view.viewData("Hello, choose function: \n" +
                "exit (to finish program) \n" +
                "show (to show agreement items) \n " +
                "get (to get total price)\n" +
                "sort (to sort agreement items by risk\n" +
                "find (to find particular item)):");
        start();

    }

    public void start() {
        boolean flag = true;
        while (flag) {
            view.viewData("Available commands: exit/show/price/sort/item");
            String message = InputData.scan();
            switch (message.toLowerCase()) {
                case ("show"): {
                    view.viewData(ConverterToString.converteToString(model.getAgreementItems()));
                    break;
                }
                case ("exit"): {
                    flag = false;
                    break;
                }

                case ("price"): {
                    view.viewData("Total price ->" + model.getTotalPrice());
                    break;
                }
                case ("item"): {
                    getItem();
                    break;
                }
                case ("sort"): {
                    view.viewData(ConverterToString.converteToString(model.getSorted()));
                    break;
                }
                default: view.viewData("Invalid criteria");
            }
        }
    }

    private void getItem() {
        view.viewData("Choose a criteria (price/risk): ");
        String message1 = InputData.scan();
        switch (message1.toLowerCase()){
            case ("price"): {
                view.viewData("Enter range(number, number): ");
                int[] range = getRange();
                view.viewData(ConverterToString.converteToString(model.getItemsByPrice(range[0],range[1])));
                break;
            }
            case ("risk"): {
                view.viewData("Enter range(number, number): ");
                int[] range = getRange();
                view.viewData(ConverterToString.converteToString(model.getItemsByRisk(range[0],range[1])));
                break;
            }
            default: view.viewData("Invalid criteria");
            break;
        }
    }

    private int[] getRange(){
        int[] range = new int[2];
        view.viewData("Enter first number: ");
        range[0] = InputData.scanInt();
        view.viewData("Enter second number: ");
        range[1] = InputData.scanInt();
        return range;
    }
}
