package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student[] students = {
                new Student("David","Andersen",1987),
                new Student("Rasmus","Fjordsen",1994),
                new Student("Ole","Olesen",1920),
                new Student("Eva","Simon",1990),
                new Student("David","Kane",1980)
        };

        Arrays.sort(students);

        for (Student student: students){
            System.out.printf("Name: %s Lastname: %s Year of Born: %d \n", student.getFirstname(), student.getLastname(), student.getYearOfBorn());
        }
    }
}
