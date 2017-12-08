package com.headfirstjava;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);

        //make a variable to hold the result we'll return
        String result = "miss";

        //enhanced for loop
        for (int cell : locationCells) {
            if (guess ==cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        } //end for

        if (numOfHits ==locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}
