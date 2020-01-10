package com.epam.controller;

import com.epam.model.RegisterModel;
import com.epam.view.InputData;
import com.epam.view.RegisterView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterController {
    RegisterModel model = new RegisterModel();
    RegisterView view = new RegisterView();

    public void run(){
        boolean flag = true;
        view.viewData("Hello, choose command, please:\n" + "1. show notes;\n" + "2. add note;\n" + "3. exit.\n");
        while (flag) {
            view.viewData("Enter the number of command -> ");
            String message = InputData.scan();
            if (checkMessage1(message)) {
                switch (message){
                    case "1": {
                        view.viewData(Converter.convertToString(model.getRegister()));
                        break;
                    }
                    case "2": {
                        String lastName = setName(1);
                        String firstName = setName(2);
                        String birthDay = setBirthday();
                        String phoneNumber = setPhoneNumber();
                        String homeAddress = setHomeAddress();
                        model.addNote(lastName, firstName, birthDay, phoneNumber, homeAddress);
                        break;
                    }
                    case "3": {
                        flag = false;
                        break;
                    }
                }
            } else {
                view.viewData("Wrong Command!");
            }


        }

    }

    private boolean checkMessage1 (String message) {
        Pattern p = Pattern.compile("[1-3]");
        Matcher m = p.matcher(message);
        return m.find();
    }

    private String setName(int index) {
        boolean flag = false;
        switch (index) {
            case 1: view.viewData("Enter the last name (Sparks) -> "); break;
            case 2: view.viewData("Enter the first name (Jane) -> "); break;
        }
        String message = "";
        Pattern p = Pattern.compile("[A-Z][a-z]+");
        while (!flag) {
            message = InputData.scan();
            Matcher m = p.matcher(message);
            if (m.find()) {
                flag = true;
            } else {
                view.viewData("Incorrect form!");
            }
        }
        return message;
    }

    private String setBirthday() {
        boolean flag = false;
        view.viewData("Enter the birthday (31/12/2019) -> ");
        String message = "";
        Pattern p = Pattern.compile("([1-2][0-9]|[3][0-1]|[1-9])[/]([1-9]|[1][0-2])[/]([1][9][0-9]{2}|[2][0][0-1][0-9]" +
                "|[2][0][2][0])");
        while (!flag) {
            message = InputData.scan();
            Matcher m = p.matcher(message);
            if (m.find()) {
                flag = true;
            } else {
                view.viewData("Incorrect form!");
            }
        }
        return message;
    }

    private String setPhoneNumber() {
        boolean flag = false;
        view.viewData("Enter the phone number (+380(98)545-41-41) -> ");
        String message = "";
        Pattern p = Pattern.compile("\\+[1-9]\\d{2}\\(\\d{2}\\)\\d{3}\\-\\d{2}\\-\\d{2}");
        while (!flag) {
            message = InputData.scan();
            Matcher m = p.matcher(message);
            if (m.find()) {
                flag = true;
            } else {
                view.viewData("Incorrect form!");
            }
        }
        return message;
    }

    private String setHomeAddress() {
        String address = "";
        boolean flag = false;
        view.viewData("Enter the city (Kyiv) -> ");
        while (!flag) {
            Pattern p = Pattern.compile("([A-Z][a-z]+)");
            String city = InputData.scan();
            Matcher m = p.matcher(city);
            if (m.find()) {
                address+=city + ", ";
                flag = true;
            } else {
                view.viewData("Incorrect form!");
            }
        }
        flag = false;
        view.viewData("Enter the name of street (Volodymyrska) -> ");
        while (!flag) {
            Pattern p = Pattern.compile("([A-Z][a-z]+)");
            String street = InputData.scan();
            Matcher m = p.matcher(street);
            if (m.find()) {
                address+=street + " street, ";
                flag = true;
            } else {
                view.viewData("Incorrect form!");
            }
        }
        flag = false;
        view.viewData("Enter the number of building (18) -> ");
        while (!flag) {
            Pattern p = Pattern.compile("[1-9]|[1-9][0-9]+");
            String number = InputData.scan();
            Matcher m = p.matcher(number);
            if (m.find()) {
                address+=number;
                flag = true;
            } else {
                view.viewData("Incorrect form!");
            }
        }
        return address;
    }
}
