/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            int countLine = Manager.countLine();
            int count = 1;
            br = new BufferedReader(new FileReader(new File("/Users/tramy/Documents/Learning Uni/Semester 3/LAB211/LAB/WEEK 4/NormalizeText/src/test.txt")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("/Users/tramy/Desktop/output.txt", true)));
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (Manager.isLineEmpty(line)) {
                    continue;
                }
                line = Manager.formatOneSpace(line);
                line = Manager.formatSpecialCharacters(line);
                line = Manager.afterDotUpperCase(line);
                line = Manager.noSpaceQuotes(line);
                line = Manager.firstUpercase(line);
                line = Manager.lastAddDot(line);
                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
