package com.epam.model;

import java.util.Objects;

public class Note {
    private String lastName;
    private String firstName;
    private String birthDay;
    private String phoneNumber;
    private String homeAddress;

    public Note(String lastName, String firstName, String birthDay, String phoneNumber, String homeAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Note(" +
                "lastName=" + lastName + '\n' +
                ", firstName=" + firstName + '\n' +
                ", birthDay=" + birthDay + '\n' +
                ", phoneNumber=" + phoneNumber + '\n' +
                ", address=" + homeAddress + '\n' +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return lastName.equals(note.lastName) &&
                firstName.equals(note.firstName) &&
                birthDay.equals(note.birthDay) &&
                phoneNumber.equals(note.phoneNumber) &&
                homeAddress.equals(note.homeAddress);
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(lastName, firstName, birthDay, phoneNumber, homeAddress);
    }

}
