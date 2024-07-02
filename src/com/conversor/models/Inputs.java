package com.conversor.models;

public class Inputs{
    private String firstCur;
    private String secCur;
    private double amount;

    public String getFirstCur() {
        return firstCur;
    }

    public void setFirstCur(String firstCur) {
        this.firstCur = firstCur;
    }

    public String getSecCur() {
        return secCur;
    }

    public void setSecCur(String secCur) {
        this.secCur = secCur;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

//    public Inputs(String firstCur, String secCur, double amount) {
//        this.firstCur = firstCur;
//        this.secCur = secCur;
//        this.amount = amount;
//    }

    @Override
    public String toString() {
        return  "firstCur='" + firstCur + '\'' +
                ", secCur=' " + secCur + '\'' +
                ", amount= " + amount +
                '}';
    }
}
