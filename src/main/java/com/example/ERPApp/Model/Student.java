package com.example.ERPApp.Model;

import java.util.List;

public class Student {
    private int roll_Number;
    private String name;
    private String gender;
    private List<Double> marks;
    private String city;

    public Student(int roll_Number, String name, String gender, List<Double> marks, String city) {
        this.roll_Number = roll_Number;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        this.city = city;
    }

    public int getRoll_Number() {
        return roll_Number;
    }

    public void setRoll_Number(int roll_Number) {
        this.roll_Number = roll_Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "ERP{" +
                "roll_Number=" + roll_Number +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                ", city='" + city + '\'' +
                '}';
    }
}
