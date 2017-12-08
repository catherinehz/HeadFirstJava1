package com.headfirstjava;

public class SimpleDotcomTestDrive {

    public static void main (String[] args) {
        //instantiate a SimpleDotCom object
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        //invoke the setter method for the location of the dot com
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
