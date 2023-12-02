package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // PART 1:
        //Integer total = calculateCalibrationValuePart1();

        // PART 2:
        Integer total = calculateCalibrationValuePart2();

        System.out.println(total);

    }

    private static Integer calculateCalibrationValuePart2() throws IOException {
        FileReader input = new FileReader("src/input.txt");
        BufferedReader br = new BufferedReader(input);

        String inputLine = br.readLine();

        Integer totalValueCounter = 0;

        while (inputLine != null) {
            totalValueCounter += getCalibrationValuePart2(inputLine);
            inputLine = br.readLine();
        }
        return totalValueCounter;
    }

    private static Integer calculateCalibrationValuePart1() throws IOException {
        FileReader input = new FileReader("src/input.txt");
        BufferedReader br = new BufferedReader(input);

        String inputLine = br.readLine();

        Integer totalValueCounter = 0;

        while (inputLine != null) {
            totalValueCounter += getCalibrationValue(inputLine);
            inputLine = br.readLine();
        }
        return totalValueCounter;
    }

    private static Integer getCalibrationValue(String inputLine) {
        char[] inputChars = inputLine.toCharArray();
        // Find first digit
        char firstDigit = 0;
        char lastDigit = 0;
        for (char ch : inputChars) {
            if (Character.isDigit(ch)) {
                firstDigit = ch;
                break;
            }
        }

        // Reverse the array
        char[] reverseInputChars = new char[inputChars.length];
        for (int i = 0; i < inputChars.length; i++) {
            reverseInputChars[inputChars.length - 1 - i] = inputChars[i];
        }

        // Find last digit (find the first digit in the reversed array)
        for (char ch : reverseInputChars) {
            if (Character.isDigit(ch)) {
                lastDigit = ch;
                break;
            }
        }
        // Concatenate both digits and return the result
        return Integer.parseInt(Character.toString(firstDigit) + Character.toString(lastDigit));
    }

    private static Integer getCalibrationValuePart2(String inputLine) {
        inputLine = inputLine.replaceAll("one", "o1e");
        inputLine = inputLine.replaceAll("two", "t2o");
        inputLine = inputLine.replaceAll("three", "thr3e");
        inputLine = inputLine.replaceAll("four", "fo4r");
        inputLine = inputLine.replaceAll("five", "f5ve");
        inputLine = inputLine.replaceAll("six", "s6x");
        inputLine = inputLine.replaceAll("seven", "sev7n");
        inputLine = inputLine.replaceAll("eight", "eig8t");
        inputLine = inputLine.replaceAll("nine", "n9ne");

        char[] inputChars = inputLine.toCharArray();
        // Find first digit
        char firstDigit = 0;
        char lastDigit = 0;
        for (char ch : inputChars) {
            if (Character.isDigit(ch)) {
                firstDigit = ch;
                break;
            }
        }

        // Reverse the array
        char[] reverseInputChars = new char[inputChars.length];
        for (int i = 0; i < inputChars.length; i++) {
            reverseInputChars[inputChars.length - 1 - i] = inputChars[i];
        }

        // Find last digit (find the first digit in the reversed array)
        for (char ch : reverseInputChars) {
            if (Character.isDigit(ch)) {
                lastDigit = ch;
                break;
            }
        }
        // Concatenate both digits and return the result
        return Integer.parseInt(Character.toString(firstDigit) + Character.toString(lastDigit));
    }
}