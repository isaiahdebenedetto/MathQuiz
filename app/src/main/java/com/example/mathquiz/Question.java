package com.example.mathquiz;

import java.util.Random;

public class Question {

    private int firstNumner;
    private int secondNumber;
    private int answer;

    // there are four possible choices for the user to pick from
    private int [] answerArray;

    // which of the positions is correct
    private int answerPosition;

    // the maximum value of firstNumber or secondNumber
    private int upperLimit;

    // string output of the problem e.g. " 4 + 9 = "
    private String questionPhrase;


    // constructor - generate a new random question
    public Question(int upperLimit) {
        this.upperLimit = upperLimit;
        Random randomNumber = new Random();

        this.firstNumner = randomNumber.nextInt(upperLimit);
        this.secondNumber = randomNumber.nextInt(upperLimit);
        this.answer = this.firstNumner + this.secondNumber;
        this.questionPhrase = firstNumner + " + " + secondNumber + " = ";

        this.answerPosition = randomNumber.nextInt(4);
        this.answerArray = new int[] {0,1,2,3};

        this.answerArray[0] = answer +1;
        this.answerArray[1] = answer +10;
        this.answerArray[2] = answer - 5;
        this.answerArray[3] = answer - 2;

        this.answerArray = shuffleArray(this.answerArray);

        answerArray[answerPosition] = answer;
    }

    private int [] shuffleArray(int[] array) {
        int index, temp;
        Random rng = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            index = rng.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // getters and setters
    public int getFirstNumner() {
        return firstNumner;
    }

    public void setFirstNumner(int firstNumner) {
        this.firstNumner = firstNumner;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int[] getAnswerArray() {
        return answerArray;
    }

    public void setAnswerArray(int[] answerArray) {
        this.answerArray = answerArray;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionPhrase() {
        return questionPhrase;
    }

    public void setQuestionPhrase(String questionPhrase) {
        this.questionPhrase = questionPhrase;
    }
}
