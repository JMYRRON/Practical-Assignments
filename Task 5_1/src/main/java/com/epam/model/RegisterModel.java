package com.epam.model;

import java.util.Arrays;

public class RegisterModel {
    private Note[] register;
    private int index = 0;

    public RegisterModel() {
        this.register = new Note[8];
    }

    public void addNote(String lastName, String firstName, String birthDay, String phoneNumber, String homeAddress){
        if (index+register.length/4>register.length){
            Note[] newRegister = new Note[register.length+register.length/2];
            Arrays.copyOf(register,register.length);
            register = newRegister;
        }
        register[index] = new Note(lastName, firstName, birthDay, phoneNumber, homeAddress);
        index++;
    }

    public Note[] getRegister() {
        return register;
    }
}
