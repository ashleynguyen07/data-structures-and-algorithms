/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author tramy
 */
public class TestingNormalizeText {
    
    public static void main(String[] args) throws IOException {
        // Read input.txt
        Scanner inputScanner = new Scanner(new File("/Users/tramy/Documents/Learning Uni/Semester 3/LAB211/LAB/WEEK 4/NormalizeText/src/test.txt"));
        StringBuilder inputBuilder = new StringBuilder();
        while (inputScanner.hasNextLine()) {
            inputBuilder.append(inputScanner.nextLine().trim());
            inputBuilder.append(" ");
        }
        inputScanner.close();

        // Normalize text
        String input = inputBuilder.toString().trim();
        input = input.replaceAll(" +", " ");
//        input = input.replaceAll(" ?", " ");

        input = input.replaceAll("([a-z])\\. ", "$1. ");
        input = input.replaceAll(" \\.", ". ");
        input = input.replaceAll(" ,", ",");
        input = input.replaceAll(" :", ":");
        input = input.replaceAll("\\.\"", ".\"");
        input = input.replaceAll(" \\.$", ".");
        input = input.replaceAll("^([a-z])", "$1".toUpperCase());
        input = input.replaceAll("\\b(\\w+)\\b", "$1".toLowerCase());

        // Write output.txt
        PrintWriter writer = new PrintWriter(new File("/Users/tramy/Desktop/output.txt"));
        writer.println(input);
        writer.close();
    }
}

