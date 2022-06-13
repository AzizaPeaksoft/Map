package com.company;

public class Car {
    private int id;
    private String num;

    public Car(int id, String num) {
        this.id = id;
        this.num = num;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id "  + id +
               "," + " num " + num +
                " ";
    }
}
