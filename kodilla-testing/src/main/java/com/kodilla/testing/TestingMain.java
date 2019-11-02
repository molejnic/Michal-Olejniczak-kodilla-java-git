package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test

        Calculator calculator = new Calculator(5,4);

        if (calculator.add(5, 4) == 9){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (calculator.subtract(5, 4) == 1){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        }
    }
