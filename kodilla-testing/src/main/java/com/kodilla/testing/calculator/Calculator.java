package com.kodilla.testing.calculator;

public class Calculator {
    public int a;
    public int b;

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


}
