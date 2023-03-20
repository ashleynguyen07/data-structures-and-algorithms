
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tramy
 */
public class IO {

    public void zipFile() throws IOException {
        CheckInput checkInput = new CheckInput();
        Validation valid = new Validation();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Source Folder: ");
        String pathSrc = checkInput.checkString();
        System.out.print("Enter Destination Folder: ");
        String pathCompress = checkInput.checkString();
        System.out.print("Enter Name: ");
        String fileZipName = in.nextLine();

        boolean check = valid.compressTo(pathSrc, fileZipName, pathCompress);
        if (check == true) {
            System.out.println("Successfully");
        } else {
            System.out.println("Fail");
        }
    }

    public void unzipFile() throws IOException {
        CheckInput checkInput = new CheckInput();
        Validation valid = new Validation();
        System.out.print("Enter Source file: ");
        String pathZipFile = checkInput.checkString();
        System.out.print("Enter Destination Folder: ");
        String pathExtract = checkInput.checkString();
        boolean check = valid.extractTo(pathZipFile, pathExtract);
        if (check == true) {
            System.out.println("Successfully");
        } else {
            System.out.println("Fail");
        }
    }

}
