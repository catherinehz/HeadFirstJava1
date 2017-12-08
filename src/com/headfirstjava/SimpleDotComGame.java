package com.headfirstjava;

public class SimpleDotComGame {

    public static void main (String[] args) {
        int numOfGuesses = 0;

        //for getting user input for now
        //The code to get command-line input from user
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        //cast = приведение типов в результате которого последующий элемент меняет свой тип на заданный
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("you took " + numOfGuesses + " guesses");
            }
        }
    }



}
