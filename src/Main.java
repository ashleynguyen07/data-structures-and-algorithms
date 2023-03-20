/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author tramy
 */
public class Main {
    
    public static void printMain() throws IOException {
        CheckInput checkInput = new CheckInput();  
        IO zip = new IO();
        while (true) {
            System.out.println("1. Compression");
            System.out.println("2. Extraction");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choose = checkInput.checkIntLimit(1, 3);
            switch (choose) {
                case 1:
                    zip.zipFile();
                    break;
                case 2:
                    zip.unzipFile();
                    break;
                case 3:
                    return;
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
        printMain();
    }

}
