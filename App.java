package com.hetvi.Homework3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        List<Character> testData = List.of('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n');
        char toFind = 'i';
        long count = Collections.frequency(testData, toFind);
        System.out.println("Occurrences of '" + toFind + "' in the list: " + count + ".");
    }

    // Count occurrences
    public static int countChar(char[] input, char toFind) {
        return (int) IntStream.range(0, input.length)
                .filter(i -> input[i] == toFind)
                .count();
    }
}
