package org.launchcode;

public class CheckBox extends Question{
    public CheckBox(String question) {
        super(question);
    }

    public String question1(){

        this.setAnswer("This is the answer 1");
        return "this is question 1";

    }
}
