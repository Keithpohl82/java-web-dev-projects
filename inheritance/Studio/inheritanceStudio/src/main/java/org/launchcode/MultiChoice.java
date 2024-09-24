package org.launchcode;

public class MultiChoice extends Question{


    public MultiChoice(String question) {
        super(question);
    }

    public String question1(){

        this.setAnswer("This is the answer 1");
        return "this is question 1";

    }
}
