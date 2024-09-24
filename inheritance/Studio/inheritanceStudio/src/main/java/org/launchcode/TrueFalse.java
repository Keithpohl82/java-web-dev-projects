package org.launchcode;

public class TrueFalse extends Question{

    public TrueFalse(String question) {
        super(question);
    }

    public String question1(){
        this.setAnswer("This is the answer 1");
        return "this is question 1";
    }

    public String question2(){
        this.setAnswer("This is the answer 2");
        return "this is question 2";

    }

}
