/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author tramy
 */

class PersonWrapper {

    Person p;

    public PersonWrapper() {
    }

    public PersonWrapper(Person p) {
        this.p = p;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("======== Management Person programer ========");

        int n = Validate.checkInputNumberStudent();
        Person[] persons = new Person[n];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = Validate.inputPersonInfo();
        }
        PersonWrapper[] listPersonWrapper = new PersonWrapper[persons.length];
        Validate.sortBySalary(persons, listPersonWrapper);
        for (int i = 0; i < persons.length; i++) {
            listPersonWrapper[i].p.displayPersonInfo();
        }
    }
}
