package org.launchcode;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args){


        // welcome message
        // Create Quiz
        // Add questions
        // Display the question and possible answers
        // Take user input
        // Check answer
        // Method for adding points for correct answer and grading
        // truefalse testquestion = new truefalse()
        // testquestion.setQuestion("dog is carnivor")
        // Display possible answers (true/false)
        // multichoose question = new multichoose()
        // question.setQuestion(" is the answer A, B, C or D")
        // question.addpossibleAnswer(["", "", ""])
        // Display possible answers
        //
        // quizArray [test.question1(),test.question2()]


        TrueFalse testTrueFalse = new TrueFalse("Cat is Canrnivor");
        MultiChoice testMulti = new MultiChoice("List of answers");
        CheckBox testCheck = new CheckBox("Checkbox question here");

        ArrayList<String> quiz = new ArrayList<>();
        quiz.add(testCheck.getQuestion());
        quiz.add(testMulti.getQuestion());
        quiz.add(testTrueFalse.getQuestion());

        ArrayList<String> answers = new ArrayList<>();
        answers.add(testCheck.getAnswer());
        answers.add(testMulti.getAnswer());
        answers.add(testTrueFalse.getAnswer());

        for(String question : quiz){
            System.out.println(question);
            // show possible answers

            break;

            //continue loop
        }



        //System.out.println(testTrueFalse.question1());




    }
}
