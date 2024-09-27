package org.launchcode;

import java.util.ArrayList;

public class ArrayListExercise {
    static double sumOfNumbers = 0;

    public static void sumNums(ArrayList<Double> arrList){
        for(double num : arrList){
            if(num % 2 == 0){
                sumOfNumbers += num;
            }
        }
        System.out.println(sumOfNumbers);
    }

    public static void main(String[] args) {
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(1.0)
        sumNums();
    }

}
