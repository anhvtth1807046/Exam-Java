package controller;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<>();
    public void Add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EnrolID: ");
        String enrolID = scanner.nextLine();
        System.out.println("Enter FistName: ");
        String fistName = scanner.nextLine();
        System.out.println("Enter LastName: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Age: ");
        String age = scanner.nextLine();
        Student student = new Student(enrolID, fistName, lastName, age);
        list.add(student);
    }

    public void Save(){
        String fileName = "student.dat";
        try {
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(fileName));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.format("\t %-20s", "EnrollID")).append(String.format("\t %8s", "Full Name")).append(String.format(" \t %20s", "Age")).append("\n");
            stringBuilder.append("-----------------  ---------------------------------  ------------\n");
            for ( Student student : list) {
                stringBuilder.append(String.format("\t %-20s", student.getEnrolID()))
                        .append(String.format("\t %-10s", student.getLastName() + " " + student.getFistName()))
                        .append(String.format("\t %20s", student.getAge()))
                        .append("\n \n");
            }
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public void Display(){
        String fileName = "student.dat";

        String line = null;

        try {
            BufferedReader bufferedReader =
                    new BufferedReader( new FileReader(fileName));

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }


}
