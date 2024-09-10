package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {

        HashMap<Character, Integer> inputString = new HashMap<>();
        System.out.println("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (char c : str.toCharArray()) {
            if (inputString.containsKey(c)){
                inputString.put(c, inputString.get(c) + 1);
            } else {
                inputString.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : inputString.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
